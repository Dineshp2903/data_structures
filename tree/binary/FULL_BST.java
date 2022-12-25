package javamine;

public class FULL_BST {
	
	
	
	
	
	
	
	public static Boolean check_bst(Node node)
	{
		if(node == null)
		{
			return Boolean.TRUE;
		}
		if(node.left == null && node.right == null)
		{
			return Boolean.TRUE;
		}
		if(node.left != null && node.right != null)
		{
			return check_bst(node.left) && check_bst(node.right);
		}
		
		return Boolean.FALSE;
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Node root = new Node(1);
		root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.right = new Node(40);
        root.left.left = new Node(50);
        root.right.left = new Node(60);
        root.left.left.left = new Node(80);
        root.right.right = new Node(70);
        root.left.left.right = new Node(90);
        root.left.right.left = new Node(80);
        root.left.right.right = new Node(90);
        root.right.left.left = new Node(80);
        root.right.left.right = new Node(90);
        root.right.right.left = new Node(80);
        root.right.right.right = new Node(90);
		//node.right.right = new Node(5);
		System.out.println(check_bst(root));

	}

}
