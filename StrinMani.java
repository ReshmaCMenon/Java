import java.util.Scanner;
public class StrinMani {
    public static void main(String[] args) {
      int n;
      Scanner reader=new Scanner(System.in);
      while(true)
      {
      System.out.println("***String Operations***\n1.Length\n2.Concatenate\n3.Compare\n4.Copy\n5.Exit\n Choose option:");
      n=reader.nextInt();
      switch(n)
      {
          case 1:System.out.print("Enter the string:");
                 String s1=reader.next();
                 int len=s1.length();
                 System.out.println("String length: "+len);
                 break;
          case 2:System.out.print("Enter the first string:");
                 String s2=reader.next();
                 System.out.print("Enter the second string:");
                 String s3=reader.next();
                 String s4=s2.concat(s3);
                 String s5=s2+s3;
                 System.out.println("Concatenated String: "+s5);
                 System.out.println("\nConcatenated String using Library Functions: "+s4);
                 break;
          case 3:System.out.print("Enter the first string:");
                 s2=reader.next();
                 System.out.print("Enter the second string:");
                 s3=reader.next();
                /*if(s2==s3)
                 {
                 System.out.print("\nStrings are equal");
                 }
                 else
                 {
                 System.out.print("\nStrings are not equal");
                 }*/
                 System.out.println("\nCompare String using Library Functions: "+s2.equals(s3));
                 break;
          case 4:System.out.print("Enter first string:");
                 s1=reader.next();
                 System.out.print("Enter Second string:");
                 s2=reader.next();
                 s2=s1;
                 System.out.println("Copied String: "+s2);
                 break;  
           case 5:System.out.print("Exit");
                  return;
      }
      }
      
      
    }
    
}
