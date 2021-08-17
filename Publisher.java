import java.util.Scanner;
 class Publisher{
Scanner reader=new Scanner(System.in);
 
   String name;
  public Publisher(){
  name=" ";
  }
  public void input()
   {
   System.out.println("Enter The Name Of Publisher:");
   name=reader.next();
   
   }
}

class Book extends Publisher{
int book_id,price;
String book_name;
 public Book()
{
book_id=0;
price=0;
book_name="  ";
}
public void binput()
{
  System.out.println("Enter the book id:");
  book_id=reader.nextInt();
  System.out.println("Enter The Name Of Book:");
  book_name=reader.next();
  System.out.println("Enter The Price Of Book:");
  price=reader.nextInt();
   }
}
class Fiction extends Book{
String Fic;
 public Fiction()
{
Fic="";
}
void finput()
{
System.out.println("Fiction or Nonfiction:");
Fic=reader.next();
}
}
class Literature extends Book{
String lit;
 public Literature()
{
lit="";
}
void litinput()
{
System.out.println("Enter The Type Of Literature:");
lit=reader.next();
}

   public static void main(String args[]){
   Fiction f=new Fiction();
   Literature l=new Literature();
 
  l.input();
  l.binput();
  f.finput();
  l.litinput();
  System.out.println("----BOOK DETAILS----");
  System.out.println("Name of Publisher:"+l.name);
  System.out.println("Book ID:"+l.book_id);
  System.out.println("Name of Book:"+l.book_name);
  System.out.println("Price Of Book:"+l.price);
  System.out.println("Fiction or Nonfiction:"+f.Fic);
  System.out.println("Literature Type:"+l.lit);
 
  }
}  

   


