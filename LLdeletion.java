class LLdeletion {
    Node head; 
    class Node {
        int data;
        Node next;
        Node(int dt)
        {
            data = dt;
            next = null;
        }
    }
    void deleteNode(int key)
    {
        // Store head node
        Node temp = head, prev = null;
 
        // If head node itself holds the key to be deleted
        if (temp != null && temp.data == key) {
            head = temp.next; // Changed head
            return;
        }
 
        // Search for the key to be deleted, keep track of
        // the previous node as we need to change temp.next
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }
 
        // If key was not present in linked list
        if (temp == null)
            return;
 
        // Unlink the node from linked list
        prev.next = temp.next;
    }
 
    /* Inserts a new Node at front of the list. */
    public void insert(int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
 
    /* This function prints contents of linked list starting
       from the given node */
    public void display()
    {
        Node tnode = head;
        while (tnode != null) {
            System.out.print(tnode.data + " ");
            tnode = tnode.next;
        }
    }
    public static void main(String[] args)
    {
        LLdeletion llist = new LLdeletion();
 
        llist.insert(10);
        llist.insert(15);
        llist.insert(30);
        llist.insert(45);
 
        System.out.println("\nCreated Linked list is:");
        llist.display();
 
        llist.deleteNode(10); 
        llist.deleteNode(30); 
        llist.deleteNode(15);
        llist.deleteNode(45);
        
        System.out.println( "\nLinked List after Deletion :");
        llist.display();
    }
}


