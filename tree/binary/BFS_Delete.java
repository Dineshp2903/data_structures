package javamine;
import java.util.Queue;
import java.util.LinkedList;


public class BFS_Delete {
	
	
	
	
	public static Node deleteNode(Node node,int val)
	{
		if(node == null)
		{
			return null;
		}
		if(node.left == null && node.right == null)
		{
			return node.data == val ?null : node;
		}
		
		Queue<Node> queue = new LinkedList<Node>();
		queue.offer(node);
		Node temp = null,last = null,keyNode = null;
		while(!queue.isEmpty())
		{
			temp = queue.poll();
			
			if(val == temp.data)
			{
				keyNode = temp;
			}
			
			if(temp.left != null)
			{
				last = temp;
				queue.offer(temp.left);
			}
			if(temp.right != null)
			{
				last = temp;
				queue.offer(temp.right);
				
			}	
		}
		if(keyNode != null)
		{
			keyNode.data = temp.data;
			if(last.right != null)
			{
				last.right = null;
			}
			else
			{
				last.left = null;
			}
		}
		return node;
		
		
	}
	
	public void inOrderTraversal(Node node)
	{
		if(node == null)
		{
			return;
		}
		inOrderTraversal(node.left);
		System.out.print(node.data+" ");
		inOrderTraversal(node.right);
		
	}

	public static void main(String[] args) {
		
		Node root = 	new Node(13);
		root.left = new Node(12);
		root.right = new Node(10);
		root.left.left = new Node(4);
		root.left.right = new Node(19);
		root.right.left = new Node(16);
		root.right.right = new Node(9);
		
		
		BFS_Delete bfs = new BFS_Delete();
		bfs.inOrderTraversal(root);
		Node n = bfs.deleteNode(root,10);
		bfs.inOrderTraversal(n);
		
		
	}

}
