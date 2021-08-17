import java.lang.Exception;
import java.util.Scanner;
class PosException extends Exception
{
    PosException(String Message)
            
    {
        System.out.println(Message);
    }
}
public class AverageExcep {
    public static void main(String[] args){
        try {
            int i, n, sum=0;
            double average=0;
            int elem[]=new int[40];
            Scanner reader = new Scanner(System.in);
            System.out.print("Enter number of elements: ");
            n = reader.nextInt();
            System.out.println("Enter elements: ");
            for (i = 0; i < n; i++) {
                elem[i] = reader.nextInt();
                //System.out.print(elem[i]);
            }
            for(i=0;i<n;i++) {
                if (elem[i] >= 0) {
                    sum = elem[i] + sum;
                }
                else
                    throw new PosException("Entered number is Negative");
            }
                //System.out.print(sum);
                average = sum/n;
                System.out.print("\nAverage is " +average);
        }
        catch (PosException n) {
            System.out.println("Caught Exception");
            System.out.println(n);
            
        }
    }
}

