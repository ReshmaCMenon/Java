import java.util.Scanner;
public class ShapeArea {
    void area(float x)
    {
        System.out.println("The area of the square is :"+Math.pow(x,2)+" sq units");
    }
    void area(float x,float y)
    {
        System.out.println("The area of th rectangle is :" +x*y+ " sq units");
    }
    void area(double x)
    {
        double z=3.14*x*x;
        System.out.println("The area of the circle is "+z+" sq units");
    }
}
class Overload {
    public static void main(String []args)
    {
        float s,l,b;
        double r;
        Scanner reader=new Scanner(System.in);
        ShapeArea ar=new ShapeArea();
        System.out.print("enter the side of Square");
        s=reader.nextFloat();
        System.out.print("Enter the length of Rectangle:");
        l=reader.nextFloat();
        System.out.print("Enter the bredth of Rectangle:");
        b=reader.nextFloat();
        System.out.print("Enter the radius of Circle:");
        r=reader.nextDouble();
        ar.area(s);
        ar.area(l,b);
        ar.area(r);
    }
}
