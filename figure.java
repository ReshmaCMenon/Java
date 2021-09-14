package graphics;

import java.util.Scanner;

        interface areafigures {
        void trian();
        void rect();
        void squr();
        void cir();
    }
    public class figure{
        Scanner reader=new Scanner(System.in);
       public void trian(){
            System.out.println("\n Enter the breadth and height of triangle:  ");
            float b=reader.nextFloat();
            float h=reader.nextFloat();
            System.out.println("The area of triangle is: "+(0.5*(b*h)));
        }
        public void rect(){
            System.out.println("\n\n Enter the length and breadth of rectangle:  ");
            float l=reader.nextFloat();
            float b=reader.nextFloat();
            System.out.println("The area of rectangle is: "+(l*b));
        }
        public void squr(){
            System.out.println("\n\n Enter the side of square:  ");
            float s=reader.nextFloat();
            System.out.println("The area of square is: "+(s*s));
        }
        public void cir() {
            System.out.println("\n\n Enter the radius of circle:  ");
            float r = reader.nextFloat();
            System.out.println("The area of circle is: " + (3.14 * r * r));
        }
}