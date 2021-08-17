import java.util.Scanner;
public class person {
    String name,gender,address;
    int age;
    public person(){
      name=" ";
      gender=" ";
      address=" ";
      age=0;
    }
    public void pinput(){
        Scanner reader=new Scanner(System.in);
        System.out.print("\nEnter name: ");
        name=reader.next();
        System.out.print("Enter gender :");
        gender=reader.next();
        System.out.print("Enter address: ");
        address=reader.next();
        System.out.print("Enter the age: ");
        age=reader.nextInt();
    }
}
 class Employee extends person{
    int empid;
    String comp_name,qualification;
    float sal;
    public Employee(){
        empid=0;
        comp_name=" ";
        qualification=" ";
        sal=0;
    }
    public void einput(){
        Scanner reader=new Scanner(System.in);
        System.out.print("Enter the employee id: ");
        empid=reader.nextInt();
        System.out.print("Enter company name: ");
        comp_name=reader.next();
        System.out.print("Enter qualification: ");
        qualification=reader.next();
        System.out.print("Enter salary: ");
        sal=reader.nextFloat();
    }
}
class Teacher extends Employee{
    String subject,dept;
    int tid;
    public Teacher(){
        subject=" ";
        dept=" ";
        tid=0;
    }
    public void tinput(){
        Scanner reader=new Scanner(System.in);
        System.out.print("Enter subject: ");
        subject=reader.next();
        System.out.print("Enter department: ");
        dept=reader.next();
        System.out.print("Enter teacher id: ");
        tid=reader.nextInt();

    }
    public void output(){
        System.out.println("\nNAME: "+name);
        System.out.println("GENGER: "+gender);
        System.out.println("ADDRESS: "+address);
        System.out.println("AGE: "+age);
        System.out.println("EMPLOYEE ID: "+empid);
        System.out.println("COMPANY NAME: "+comp_name);
        System.out.println("QUALIFICATION: "+qualification);
        System.out.println("SALARY: "+sal);
        System.out.println("SUBJECT: "+subject);
        System.out.println("DEPARTMENT: "+dept);
        System.out.println("TEACHER ID: "+tid+"\n");
    }

    public static void main(String[] args) {
        int n;
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        n = reader.nextInt();
        Teacher t[] = new Teacher[n];
        for (int i = 0; i < n; i++) {
            t[i] = new Teacher();
            t[i].pinput();
            System.out.print("\n");
            t[i].einput();
            System.out.print("\n");
            t[i].tinput();
        }
        for (int i=0;i<n;i++){
            System.out.print("\nEMPLOYEE DETAILS: ");
            t[i].output();
        }
    }
}