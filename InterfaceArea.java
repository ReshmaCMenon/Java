
import java.util.Scanner;

interface area1 {

    double pi = 3.14;

    void area(double x, double y);

    void peri(double x, double y);

    void area(double x);

    void peri(double x);
}

class rect implements area1 {

    public void area(double x, double y) {
        System.out.print("Area of rectangle is: " + (x * y));
    }

    public void peri(double x, double y) {
        System.out.print("Perimeter of rectangle is:" + (2 * (x + y)));
    }

    public void area(double x) {
    }

    public void peri(double x) {
    }
}

class cir implements area1 {

    public void area(double x) {
        System.out.print("Area of circle is: " + (pi * x * x));
    }

    public void peri(double x) {
        System.out.print("Perimeter of Circle is: " + (2 * pi * x));
    }

    public void area(double x, double y) {
    }

    public void peri(double x, double y) {
    }
}

class InterfaceArea {

    public static void main(String[] args) {
        rect r = new rect();
        cir c = new cir();
        int ch;
        double l, b, s;
        Scanner reader = new Scanner(System.in);
        while (true) {
            System.out.print("\nMENU \n1. Area of rectangle \n2.Area of circle \n3.Perimeter of rectangle \n4.Perimeter of circle \nEnter your choice:\n");
            ch = reader.nextInt();
            switch (ch) {
                case 1:
                    System.out.print("Enter the length and breadth of rectangle: ");
                    l = reader.nextDouble();
                    b = reader.nextDouble();
                    r.area(l, b);
                    break;
                case 2:
                    System.out.print("Enter the radius of circle: ");
                    s = reader.nextDouble();
                    c.area(s);
                    break;
                case 3:
                    System.out.print("Enter the length and breadth of rectangle: ");
                    l = reader.nextDouble();
                    b = reader.nextDouble();
                    r.peri(l, b);
                    break;
                case 4:
                    System.out.print("Enter the radius of circle: ");
                    s = reader.nextDouble();
                    c.peri(s);
                    break;
                default:
                    System.out.print("Invalid choice");
                    return;
            }
        }
    }
}
