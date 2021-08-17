import java.util.Scanner;
public class  MatAddition {
    public static void main(String  [] args) {
      int row,col,i,j;
      Scanner reader=new Scanner(System.in);
      System.out.print("Enter the number of rows :");
      row=reader.nextInt();
     System.out.print("Enter the number of columns :");
      col=reader.nextInt();
      int a[][] = new int[row][col];
      System.out.println("Enter all the elements of first matrix:");
            for (i = 0; i < row; i++) 
            {
                for ( j = 0; j < col; j++) 
                {
                    a[i][j] = reader.nextInt();
                }
            }
              int b[][] = new int[row][col];
     System.out.println("Enter all the elements of second matrix:");
            for ( i = 0; i < row; i++) 
            {
                for (j = 0; j < col; j++) 
                {
                    b[i][j] = reader.nextInt();
                }
            }
        int c[][] = new int[row][col];

             for( i=0;i<row;i++)
      {
         for( j=0;j<col;j++)
          {
            c[i][j]=a[i][j]+b[i][j];
          }
      }
              System.out.println("Matrix after addition:  ");
      for( i=0;i<row;i++)
      { 
          for( j=0;j<col;j++){
            System.out.print(+c[i][j] + " ");
           }
      System.out.println(" ");
      }
          
    }
   }