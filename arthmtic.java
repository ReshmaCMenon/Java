package arithmetic;

interface arthoper{
    void add(int x,int y);
    void sub(int x,int y);
    void div(int x,int y);
    void mul(int x,int y);
}
public class arthmtic {
    public void add(int x,int y){
        System.out.println("ADDITION: "+(x+y));
    }
    public void sub(int x,int y){
        System.out.println("SUBTRACTION: "+(x-y));
    }
    public void div(int x,int y){
        System.out.println("DIVISION: "+(x/y));
    }
    public void mul(int x,int y){
        System.out.println("MULTIPLICATION: "+(x*y));
    }
}
