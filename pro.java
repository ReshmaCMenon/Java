import java.util.Scanner;
class product{
    int pcode;
 String pname;
 double price;

public void input(){
  Scanner reader=new Scanner(System.in);
        System.out.println("Enter the product code:");
        pcode=reader.nextInt();
        System.out.println("Enter the product name:");
        pname=reader.nextLine();
        System.out.println("Enter the product price:");
        price=reader.nextDouble();
}
public product high(product p1,product p2)
{
    product temp=new product();
    if(this.price>p1.price&&this.price>p2.price)
    temp=this;
    else if(p1.price>this.price&&p1.price>p2.price)   
    temp=p1;
    else if(p2.price>this.price&&p2.price>p1.price)
    temp=p2;
    return temp;
}
public void output(){
    System.out.println("PRODUCT CODE:"+pcode);
    System.out.println("PRODUCT NAME:"+pname);
    System.out.println("PRODUCT PRICE:"+price);
}
}
public class pro {
    public static void main(String[] args) {
    product p=new product();
    product p1=new product();
    product p2=new product();
    product p3=new product();
    p1.input();
    p2.input();
    p3.input();
    p3.high(p1, p2);
    System.out.println("Details of 1st product:");
    p1.output();
    System.out.println("Details of 2nd product:");
    p2.output();
    System.out.println("Details of 3rd product:");
    p3.output();
    }
    
}
