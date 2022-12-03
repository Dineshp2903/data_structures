
public class LinkedList
{
    Node head;
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
    
    public static int size(LinkedList list)
    {
        int size = 0;
        if(list.head == null)
        {
            return size;
        }
        else
        {
            Node node = list.head;
            while(node != null)
            {
                size = size + 1;
                node = node.next;
            }
        }
        return size;
        
    }
    
    public static void insertfirst(LinkedList list,int data)
    {
        Node new_node = new Node(data);
        if(list.head == null)
        {
            list.head = new_node;
        }
        else
        {
            new_node.next = list.head;
            list.head = new_node;
        }
        
    }
    public static void insertAfter(LinkedList list,int posvalue,int data)
    {
        if(list.head == null)
        {
            System.out.println("List is Empty");
        }
        else
        {
            Node new_node = new Node(data);
            Node node = list.head;
            while(node != null)
            {
                if(node.data == posvalue)
                {
                    Node next = node.next;
                    node.next = new_node;
                    new_node.next = next;
                    break;
                }
                node = node.next;
            }
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
        while(node != null)
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
        insertfirst(list,0);
        insertlast(list,6);
        insertAfter(list,5,7);
        System.out.println("Printing List");
        printlist(list);
        System.out.println("List Size");
        System.out.println(size(list));
        
    }
     
}  
