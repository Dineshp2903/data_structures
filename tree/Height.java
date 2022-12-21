package javamine;

class Node
{
 int data;
 Node left = null;
 Node right  = null;
 public Node(int data)
 {
   this.data = data;
 }
}

public class Height
{
  
  public static int Height(Node node)
  {
    if(node == null)
    {
      return 0;
    }
    return 1 + Math.max(Height(node.left),Height(node.right));
  }
  public static void main(String[] args)
  {
    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    root.left.left.left = new Node(4);
    System.out.println(Height(root));
    
    
  }
  
}
