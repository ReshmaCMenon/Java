import java.util.Scanner;
public class SumAvg {
    public static void main(String [] args) {
      int n,sum=0;
      float average;
      Scanner reader=new Scanner(System.in);
      System.out.print("Enter the number of elements in the array:");
      n=reader.nextInt();
      int a[] = new int[n];
      System.out.println("Enter  elements of array:");
      for(int i=0;i<n;i++)
      {
          a[i]=reader.nextInt();
          sum=sum+a[i];
       }
      System.out.println("Sum : " +sum);
      average=(float)sum/n;
      System.out.println("Average : " +average);
    }
}
