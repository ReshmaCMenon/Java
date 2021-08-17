import java.util.Scanner;
public class Ascending {
    public static void main(String [] args) {
      int n,temp;
      Scanner reader=new Scanner(System.in);
      System.out.print("Enter the number of elements in the array:");
      n=reader.nextInt();
      int a[] = new int[n];
      System.out.println("Enter  elements of array:");
      for(int i=0;i<n;i++)
      {
          a[i]=reader.nextInt();
       }
      for(int i=0; i<n; i++)
      {         
        for(int j=i+1;j<n;j++)
         {
           if(a[i]>a[j])
              {
                   temp=a[i];
                   a[i]=a[j];
                   a[j]=temp;
               }
          }
       }
     System.out.print("Ascending order:");
     for(int i=0;i<n-1;i++)
     {
       System.out.print( a[i] +",");
      }
      
    }
}
