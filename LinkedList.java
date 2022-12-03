// Online Java Compiler
// Use this editor to write, compile and run your Java code online

public class LinkedList
{
    Node head ;
    static class Node
    {
        public int data ;
        public Node next;
        public Node(int data)
        {
            this.data = data;
            this.next = null;
        }
        
    }
    
    public static void insertlast(LinkedList list,int data)
    {
        Node new_node = new Node(data);
        if(list.head == null)
        {
            list.head = new_node;
        }
        else
        {
            Node last = list.head;
            while(last.next != null)
            {
                last = last.next;
            }
            last.next = new_node;
        }
    }
        
    public static void printlist(LinkedList list)
    {
        Node node = list.head;
        while(node.next != null)
        {
            System.out.println(node.data);
            node = node.next;
        }
    }
    
    
    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();
        
        insertlast(list,1);
        insertlast(list,2);
        insertlast(list,3);
        insertlast(list,4);
        insertlast(list,5);
        insertlast(list,6);
        System.out.println("Printing List");
        printlist(list);
        
    }
     
}  
