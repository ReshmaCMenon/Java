import  java.util.Scanner;
public class Student
{
         public static void main(String [] args)
    {
          String name;
          int roll;
          double mark;
          char grade;
          char [] branch;
          Scanner reader=new Scanner(System.in);
          System.out.print("Enter the name:");
          name=reader.nextLine();
          
          System.out.print("Enter the Roll.no:");
          roll=reader.nextInt();
            
         System.out.print("Enter the Branch:");
         branch=reader.next().toCharArray();
         
        System.out.print("Enter the mark:");
        mark=reader.nextDouble();

        System.out.print("Enter the Grade:");
         grade=reader.next().charAt(0);
         
        System.out.println("Student Details:");
        System.out.print("Name : " +name+  "\nRoll.No : " +roll+ "\n Branch:");
        for(int i=0; i<branch.length;i++)
        System.out.print(branch[i]);
       System.out.print( "\nMark:" +mark+  "\nGrade:" +grade);
     }
 }