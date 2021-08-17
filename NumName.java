import java.util.Scanner;
public class NumName{
     public static void main(String [] args){
     Scanner reader =new Scanner(System.in);
     System.out.print("Enter number between  0 and 9:");
     int num=reader.nextInt();
     switch(num)
     {
      case 1:
      System.out.println("The number name of " +num+ " is One.");
      break; 
      case 2:
      System.out.println("The number name of " +num+ " is Two.");
      break;
      case 3:
      System.out.println("The number name of " +num+ " is Three.");
      break; 
      case 4:
      System.out.println("The number name of " +num+ " is  Four.");
      break; 
      case 5:
      System.out.println("The number name of " +num+ " is Five.");
      break; 
      case 6:
      System.out.println("The number name of " +num+ " is  Six.");
      break; 
      case 7:
      System.out.println("The number name of " +num+ " is  Seven.");
      break; 
      case 8:
      System.out.println("The number name of " +num+ " is Eight.");
      break; 
      case 9:
      System.out.println("The number name of " +num+ " is Nine.");
      break; 
      default:
      System.out.println("Invalid Entry.");
      }
    }
}