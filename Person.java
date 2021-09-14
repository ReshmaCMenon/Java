import java.util.Scanner;
public class Person{
    String Name,Gender,Address;
    int Age;
    
    public Person(){
        Name=" ";
        Gender=" ";
        Address=" ";
        Age=0;
    }
    public void pinput(){
        Scanner reader=new Scanner(System.in);
        System.out.println("\nEnter the Name:");
        Name=reader.next();
        System.out.println("Enter the Gender:");
        Gender=reader.next();
        System.out.println("Enter the Address:");
        Address=reader.next();
        System.out.println("Enter the Age:");
        Age=reader.nextInt();
    }
}

class Employee extends Person {
    int Empid;
    String Company_name;
    String Qualification;
    float Salary;
    
    public Employee() {
        Empid=0;
        Company_name=" ";
        Qualification=" ";
        Salary=0;
    }
    public void einput(){
        Scanner reader=new Scanner(System.in);
        System.out.println("\nEnter the Employee id:");
        Empid=reader.nextInt();
        System.out.println("Enter the Company Name:");
        Company_name=reader.next();
        System.out.println("Enter the Qualification:");
        Qualification=reader.next();
        System.out.println("Enter the Salary:");
        Salary=reader.nextFloat();
        
    }
}
class Teeacher extends Employee {
    String Sub;
    String Dept;
    int Tid;
    
    public Teeacher(){
        Sub=" ";
        Dept=" ";
        Tid=0;
    }
    public void tinput() {
        Scanner reader=new Scanner(System.in);
        System.out.println("\nEnter the Subject:");
        Sub=reader.next();
        System.out.println("Enter the Department:");
        Dept=reader.next();
        System.out.println("Enter the TeacherId:");
        Tid=reader.nextInt();
    }
    public void output() {
        System.out.println("\nNAME:"+Name);
        System.out.println("GENDER:"+Gender);
        System.out.println("ADDRESS:"+Address);
        System.out.println("AGE:"+Age);
        System.out.println("EMPLOYEE ID:"+Empid);
        System.out.println("COMPANY NAME:"+Company_name);
        System.out.println("QUALIFICTION:"+Qualification);
        System.out.println("SALARY:"+Salary);
        System.out.println("SUBJECT:"+Sub);
        System.out.println("DEPARTMENT:"+Dept);
        System.out.println("TEACHER ID:"+Tid);
    }
    public static void main (String [] args){
        int n;
        Scanner reader=new Scanner(System.in);
        System.out.print("Enter the no.of Teachers:");
        n=reader.nextInt();
        Teeacher t[]=new Teeacher[n];
        
        for(int i=0;i<n;i++){
            t[i]=new Teeacher();
            t[i].pinput();
            System.out.print("\n");
            t[i].einput();
            System.out.print("\n");
            t[i].tinput();
            
        }
        System.out.print("----Employee Details---");
        for(int i=0;i<n;i++){
            t[i].output();
             System.out.print("\n");
        }
    }
}