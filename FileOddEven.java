//import  java.io.FileReader;
import java.io.*;
//import java.io.FileWriter;
import java.util.*;
import java.io.IOException;

class FileOddEven
{
 
 public static void main(String[] args)
 {
  try{
      int n,f=0;
      Scanner reader=new Scanner(System.in);
      System.out.print("Enter the no. of integerss : ");
      n=reader.nextInt();
      int[] a=new int[n];
      System.out.print("Enter the integers : ");
      for(int i=0;i<n;i++){
          a[i]=reader.nextInt();
      }
      
     
  FileWriter fw=new FileWriter("C:\\Javapgm\\Filesamp\\Integer.txt");
  for(int i=0;i<n;i++){
    fw.write(a[i]+ "\n" );
  }
  fw.close();
  BufferedReader fr = new BufferedReader(new FileReader("C:\\Javapgm\\Filesamp\\Integer.txt"));
  
  
     FileWriter fe=new FileWriter("C:\\Javapgm\\Filesamp\\Even.txt");
     FileWriter fo=new FileWriter("C:\\Javapgm\\Filesamp\\Odd.txt");
  
  
  String i;
  while((i=fr.readLine())!=null){
       if(Integer.parseInt(i)%2==0){
           f=1;
           if(f==1)
           fe.write(i+ " ");
       }
        else
           fo.write(i+ " ");
    }
 
fr.close();
fe.close();
fo.close();
System.out.println("Copying Done");

 }
 catch(IOException e){
   System.out.println("Exception");
  }



 }

}


