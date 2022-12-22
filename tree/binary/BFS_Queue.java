package javamine;

import java.util.LinkedList;
import java.util.Queue;

public class BFS_Queue {
	
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
		// TODO Auto-generated method stub
		Node root = new Node(1);
	    root.left = new Node(2);
	    root.right = new Node(3);
	    root.left.left = new Node(4);
	    root.left.right = new Node(5);
	    root.right.left = new Node(6);
	    root.right.right = new Node(7);
	    printQueue(root);
	}

}
