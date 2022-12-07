package javamine;

public class DoublyLinkedList {
	
	 Node head = null;
	
	
	static class Node
	{
		int data;
		Node prev = null;
		Node next = null;
		public  Node(int data)
		{
			this.data = data;
		}
	}
	public void deleteElement(int data)
	{
		Node temp_head =  this.head;
		while(temp_head != null)
		{
			if(temp_head.data == data)
			{
				break;
			}
			temp_head = temp_head.next;
		}
		Node prev = temp_head.prev;
		Node next = temp_head.next;
		
		
		if(prev == null)
		{
			this.head = this.head.next;
			this.head.prev = null;
		}
		else if(next != null )
		{
			prev.next = next;
			next.prev = prev;
		}
		else {
			prev.next = null;
		}
		
		
	}
	
	public void addBefore(int data,int element)
	{
		Node temp_head =  this.head;
		while(temp_head != null)
		{
			if(temp_head.data == element)
			{
				break;
			}
			temp_head = temp_head.next;
		}
		Node prev = temp_head.prev;
		Node new_node = new Node(data);
		
		new_node.next = prev.next;
		prev.next = new_node;
		new_node.prev = prev;
		
		new_node.next.prev = new_node;
		//temp_head.prev = new_node.next;
	}
	public void addAfter(int data,int element)
	{
		Node temp_head =  this.head;
		while(temp_head != null)
		{
			if(temp_head.data == element)
			{
				temp_head = temp_head.next;
				break;
			}
			temp_head = temp_head.next;
		}
		Node prev = temp_head.prev;
		Node new_node = new Node(data);
		
		new_node.next = prev.next;
		prev.next = new_node;
		new_node.prev = prev;
		new_node.next.prev = new_node;
	}
	public void addFist(int data)
	{
		if(this.head == null)
		{
			this.head = new Node(data);
		}
		
	}
	public void add(int data)
	{
		Node temp_head = this.head;
		while(temp_head != null)
		{
			if(temp_head.next == null)
			{
				break;
			}
			temp_head = temp_head.next;
		}
		Node node = new Node(data);
		temp_head.next = node;
		node.prev = temp_head;
		
	}
	public void printlist()
	{
		Node temp_head = this.head;
		while(temp_head != null)
		{
			System.out.println(temp_head.data);
			temp_head = temp_head.next;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DoublyLinkedList dl = new DoublyLinkedList();
		dl.addFist(0);
		dl.add(1);
		dl.add(2);
		dl.add(3);
		dl.add(4);
		dl.addBefore(7,3);
		dl.addAfter(8,3);
		dl.deleteElement(0);
		dl.printlist();
		
		

	}

}
