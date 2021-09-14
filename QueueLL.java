import static java.lang.System.exit;
import java.util.Scanner;
class QNode {
    int key;
    QNode next;
    
    public QNode(int key)
    {
        this.key = key;
        this.next = null;
    }
}
 
class Queue {
    QNode front, rear;
 
    public Queue()
    {
        this.front = this.rear = null;
    }
 
    void enqueue(int key)
    {
        QNode temp = new QNode(key);
        if (this.rear == null) {
            this.front = this.rear = temp;
            return;
        }
        this.rear.next = temp;
        this.rear = temp;
    }
    void dequeue()
    {
        if (this.front == null)
            return;
        QNode temp = this.front;
        this.front = this.front.next;
        if (this.front == null)
            this.rear = null;
    }
       void display()
       {
         if (this.front == null)
            return;
         QNode ptr = front;
        while (ptr != null )
        {
            System.out.print(ptr.key+" ");
            ptr = ptr.next;
        }
        System.out.println();   
   
       }
}
 
public class QueueLL {
    public static void main(String[] args)
    {
        int n;
        Queue q = new Queue();
        /*Scanner reader=new Scanner (System.in);
        System.out.println("Enter the no.of elements:");
        n=reader.nextInt();
        int a[]=new int [n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++)
        {
            a[i]=reader.nextInt();
        }
        for (int i=0;i<n;i++)
        {
            q.enqueue(a[i]);
        }*/
       q.enqueue(15);
       q.enqueue(25);
        q.display();

        q.dequeue();
        q.dequeue();
        q.enqueue(35);
        q.enqueue(45);
        q.enqueue(60);
        q.display();
        q.dequeue();
        q.display();
        System.out.println("Queue Front : " + q.front.key);
        System.out.println("Queue Rear : " + q.rear.key);
    }
}

