package javamine;



class Node
{
  int data;
  Node left = null;
  Node right = null;
  public Node(int data)
  {
    this.data = data;
  }
    
}

public class DFS
{
    
  public void inOrderTraversal(Node root)
  {
    
    if(root == null)
    {
      return ;
    }
    
    inOrderTraversal(root.left);
    System.out.print(root.data+" ");
    inOrderTraversal(root.right);
    
  }
  
  public void preOrderTraversal(Node root)
  {
    
    if(root == null)
    {
      return ;
    }
    System.out.print(root.data +" ");
    preOrderTraversal(root.left);
    
    preOrderTraversal(root.right);
    
  }
  
  public void postOrderTraversal(Node root)
  {
    
    if(root == null)
    {
      return ;
    }
    
    postOrderTraversal(root.left);
    
    postOrderTraversal(root.right);
    System.out.print(root.data+" ");
    
  }
  
  
  public static void main(String[] args)
  {
	  
	  
	  
    Node root = new Node(1);
    
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    DFS dfs = new DFS();
    System.out.println("In order");
    dfs.inOrderTraversal(root);
    System.out.println("\nPre order");
    dfs.preOrderTraversal(root);
    System.out.println("\nPost order");
    dfs.postOrderTraversal(root);
  }
  
}
