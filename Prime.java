import java.util.Scanner;
 public class  Prime{
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num=reader.nextInt();
        System.out.println("Prime numbers are: ");
        for(int i=2;i<=num;i++)
        {
            int c=0;
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                    c++;
            }
            if(c==2)
                    System.out.print(" "+i);
 
        }
    }
}