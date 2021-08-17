import java.lang.Exception;
import java.util.Scanner;

class ExpUsername extends Exception
 {
    ExpUsername(String message)
    {
      System.out.print(message);
    }
 }
class ExpPswrd extends Exception
 {
    ExpPswrd(String message)
    {
      System.out.print(message);
    }
 }


class PassName
{
  public static void main(String args[])
   {
      Scanner reader=new Scanner(System.in);
      String usname,pswrd;
      int len;
      System.out.print("Enter the Username: ");
      usname=reader.nextLine();
      System.out.print("Enter the Password: ");
      pswrd=reader.nextLine();
      len=usname.length();
      try
      {
           if(len<8)
     
             throw new ExpUsername("\n Username Must Have Atleast 8 Charaters !!!");
       
           else if(!pswrd.equals("Reshma"))
             throw new ExpPswrd("Wrong Password !!!");
           else
            System.out.print("Login Successfull");
     }
     catch (ExpUsername n){
      System.out.print("\n Caught Exception ");
      System.out.print(n.getMessage());
     }
     catch (ExpPswrd p){
      System.out.print("\n Caught Exception ");
      System.out.print(p);
     }
 }
}

 
