package javamine;

public class Common {
	
	public static Node getNodes()
	{
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.right.left = new Node(5);
		return root;
		
	}
	public static void inOrder(Node node)
	{
		if(node == null)
		{
			return ;
		}
		inOrder(node.left);
		System.out.print(node.data+ "  ");
		inOrder(node.right);
	}

}
