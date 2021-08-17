import java.util.Scanner;
interface sports
{
    void putwt();
}
class Student1 {
    int rno;
    float p1;
    float p2;
    void input(){
        Scanner reader=new Scanner(System.in);
        System.out.println("Enter the roll no:");
        rno=reader.nextInt();
    }
    void output() {
        System.out.println("Roll no is:"+rno);
    }
    void getmark() {
        Scanner reader=new Scanner(System.in);
        System.out.println("Enter the mark 1:");
        p1=reader.nextFloat();
        System.out.println("Enter the mark 2:");
        p2=reader.nextFloat();
    }
    void putmark()
    {
        System.out.println("Mark 1:"+p1);
        System.out.println("Mark 2:"+p2);
    }
}

class results extends Student1 implements sports
{
    Scanner reader=new Scanner(System.in);
    float total,sportswt;
    public void putwt()
    {
        System.out.println("Enter the sports mark:");
        sportswt=reader.nextFloat();
    }
    void display()
    {
        System.out.println("Sports Mark:" +sportswt);
        total=p1+p2+sportswt;
        System.out.println("Total marks of "+rno + " is "+total);
    }
}
class Result
{
    public static void main(String [] args)
    {
        results r =new results();
        r.input();
        r.output();
        r.getmark();
        r.putmark();
        r.putwt();
        r.display();
    }
}
    
