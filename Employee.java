import java.util.Scanner;
public class Employee{
    int Empid;
    String Name;
    float Salary;
    String Address;

    public Employee()  {
        Empid=0;
        Name=" ";
        Salary=0;
        Address=" ";
    }

    public void einput()  {
        Scanner reader=new Scanner(System.in);
        System.out.println("Enter the Employee id:");
        Empid=reader.nextInt();
        System.out.println("Enter the name:");
        Name=reader.next();
        System.out.println("Enter the salaray:");
        Salary=reader.nextFloat();
        System.out.println("Enter the address:");
        Address=reader.next();
    }
}


class Teeacher extends Employee{
    String dept,subject;

    public Teeacher() {
        dept=" ";
        subject=" ";
    }

    public void eData() {
        //int m;
        Scanner reader=new Scanner(System.in);
        System.out.print("Enter the department:");
        dept=reader.next();
        //System.out.print(Enter the no of subjects:");
        //m=reader.nextInt();
        //Teacher s[]=new Teacher[n];
        System.out.print("Enter the subject taught:");
        subject=reader.next();
        //for(int i=0;i<m;i++) {
        //s[i]=reader.nextLine();
        // }
    }
    public void output() {
        System.out.println("Employee id = " + Empid);
        System.out.println("Employee name = " + Name);
        System.out.println("Employee salary = " + Salary);
        System.out.println("Employee address = " + Address);
        System.out.println("Employee department = " + dept);
        System.out.println("Subject taught = "+subject);
        //for (int i=0; i<sub.length; i++) {
        //    System.out.println(sub[i]+" ");
        //}

    }


    public static void main(String [] args) {
        int n;
        Scanner reader=new Scanner(System.in);
        System.out.print("Enter the no of Employees:");
        n=reader.nextInt();
        Teeacher t[]=new Teeacher[n];

        for(int i=0;i<n; i++){
            t[i]=new Teeacher();
            t[i].einput();
            t[i].eData();
            System.out.print("\n");
        }
        System.out.println("----Employee Details----");
        for (int i = 0; i < n; i++) {
            t[i].output();
            System.out.print("\n");
        }
    }
}
