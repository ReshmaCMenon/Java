import java.util.Scanner;
public class MatSymm{
     public static void main(String [] args) {
     int row,col,i,j,flag=0;
      Scanner reader=new Scanner(System.in);
      System.out.print("Enter the number of rows :");
      row=reader.nextInt();
      System.out.print("Enter the number of columns:");
      col=reader.nextInt();
      int a[][] = new int[row][col];
      System.out.println("Enter  elements of matrix:");
      for( i=0;i<row;i++)
      {
         for( j=0;j<col;j++)
          {
            a[i][j]=reader.nextInt();
          }
      }
      System.out.println("Original matrix:  ");
      for( i=0;i<row;i++)
      {
         for(j=0;j<col;j++)
          {
            System.out.print(+a[i][j] + " ");
           }
      System.out.println(" ");
      
      }


   
       if(row!=col)
      System.out.print("Matrix is not symmetric.");
      else
      {
       for(i=0;i<row;i++)
       {
          for( j=0;j<col;j++)
          {
           if(a[i][j]!=a[j][i])
           flag=1;
           break;
          }
        }
          
       if(flag==0)
       {
       System.out.print("Matrix is symmetric.");
       
       }
       else
       System.out.print("Matrix is not symmetric.");
       }
     }
   } 