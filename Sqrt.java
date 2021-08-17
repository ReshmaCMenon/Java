import java.util.Scanner;
import java.lang.Math;
public class Sqrt {
    public static void main(String [] args) {
      Scanner reader=new Scanner(System.in);
      System.out.print("Enter a number:");
      int num=reader.nextInt();
      double y=Math.sqrt(num);
      System.out.println("Square root of" + num + "=" +y);
    }
}