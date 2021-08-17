import java.util.Scanner;
class Product {
 int pcode;
String  pname;
double price;

public void Data()
{
  Scanner reader=new Scanner(System.in);
  System.out.print("Enter the product code:");
 pcode=reader.nextInt();
 System.out.print("Enter the product name:");
pname=reader.next();
 System.out.print("Enter the price:");
price=reader.nextDouble();
}

public Product low(Product p1,Product p2)
{
Product  temp=new Product();
if(this.price<p1.price&&this.price<p2.price)
temp=this;
else if(p1.price<this.price&&p1.price<p2.price)
temp=p1;
else if(p2.price<this.price&&p2.price<p1.price)
temp=p2;
return temp;
}


public void Display()
{
  System.out.println("Product Code :" +pcode);
  System.out.println("Product Name :" +pname);
 System.out.println("Product Price:" +price);
}
}
 public class LowPrice{
public static void main(String [] args)
{
    Product  p=new Product();
    Product p1=new Product();
    Product p2=new Product();
    Product p3= new Product();

    p1.Data();
    p2.Data();
    p3.Data();
    p=p3.low(p1,p2);
    System.out.println("Details of first product:");
    p1.Display();
   System.out.println("Details of second product:");
    p2.Display();
    System.out.println("Details of third product:");
    p3.Display();
   System.out.println("Product having lowest price:");
    p.Display();
}
}



