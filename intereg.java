interface waterbottle{
    
    void fillup();
}
public class intereg implements waterbottle{

   
    public static void main(String[] args) {
       
        intereg ex=new intereg();
        ex.fillup();
    }
    public void fillup()
    {
        System.out.println("Filled.");
    }
}
