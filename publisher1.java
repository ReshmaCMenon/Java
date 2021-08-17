import java.util.Scanner;
public class publisher1 {
    String name;
    public publisher1(){
        name=" ";
    }
    public void input(){
        Scanner reader=new Scanner(System.in);
        System.out.print("Enter publisher name: ");
        name=reader.next();
    }
}
class book extends publisher1{
        String bname;
        int bid;
    public book() {
            bname = " ";
            bid = 0;
        }
        public void binput () {
            Scanner reader = new Scanner(System.in);
            System.out.print("Enter book id: ");
            bid = reader.nextInt();
            System.out.print("Enter book name: ");
            bname = reader.next();
            
        }
    public static void main(String[] args) {
        book b=new book();
        b.input();
        b.binput();
        System.out.println("\nBOOK DETAILS: ");
        System.out.println("Publisher name: "+b.name);
        System.out.println("Bood id: "+b.bid);
        System.out.println("Book name: "+b.bname);
    }
}

