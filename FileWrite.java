import  java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class FileWrite
{
 
 public static void main(String[] args)
 {
  try{
      Scanner reader=new Scanner(System.in);
      String stri;
      System.out.println("Enter the string:");
      stri=reader.nextLine();
  FileWriter fw=new FileWriter("C:\\Javapgm\\Filesamp\\writesamp.txt");
  fw.write(stri);
  fw.close();
  System.out.println("File is written");
  FileReader fr=new FileReader("C:\\Javapgm\\Filesamp\\writesamp.txt");
  String str="";
  int i;
  while((i=fr.read())!=-1){
   str+=(char)i;
  }
  
 System.out.println(str);
 }
 catch(IOException e){
   System.out.println("Exception");
  }


 }

}
