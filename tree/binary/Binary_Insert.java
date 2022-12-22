package javamine;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryInsert {
	
	
	
	public static void insertNode(Node root,int data)
	{
		Node newnode = new Node(data);
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		while(!queue.isEmpty())
		{
			Node ele = queue.poll();
			if(ele.left == null)
			{
				ele.left = newnode;
				break;
			}
			else
			{
				queue.add(ele.left);
			}
			if(ele.right == null)
			{
				ele.right = newnode;
				break;
			}
			else
			{
				queue.add(ele.right);
			}
			
			
		}
	}
	public static void inOrder(Node node)
	{
		if(node == null)
		{
			return;
		}
		inOrder(node.left);
		System.out.print(node.data+" ");
		inOrder(node.right);
		
	}
	
	
	public static void printQueue(Node node)
	{
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(node);
		while(!queue.isEmpty())
		{
			Node qu = queue.poll();
			System.out.print(qu.data +"   ");
			if(qu.left != null)
			{
				queue.add(qu.left);
			}
			
			if(qu.right != null)
			{
				queue.add(qu.right);
			}
		}
	}

	public static void main(String[] args) {
		
		Node root = new Node(10);
		root.left = new Node(11);
		root.left.left = new Node(7);
		root.right = new Node(9);
		root.right.left = new Node(15);
		root.right.right = new Node(8);
		inOrder(root);
		insertNode(root,12);
		System.out.println();
		inOrder(root);
	}

}
