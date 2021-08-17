import java.util.Arrays;
import java.util.Scanner;
public class SortString {
    public static void main(String[] args) {
        int n;
        String temp;
        Scanner reader=new Scanner(System.in);
        System.out.println("Enter the no of strings:");
        n=reader.nextInt();
        System.out.println("Enter the strings:");
        String[] arr=new String[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=reader.next();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i].compareTo(arr[j])>0){
                   temp=arr[i];
                   arr[i]=arr[j];
                   arr[j]=temp; 
                }
            }
        }
        System.out.println("Sorted Strings are:");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" , ");
        }
    }
    
}
