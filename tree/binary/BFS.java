package javamine;

class Node
{
  int data;
  Node left = null,right = null;
  public Node(int d)
  {
    int.data = d;
  }
}


class BFS
{
  public static int height(Node node)
  {
    if(node == null)
        return 0;
    else
    {
      int lheight = height(node.left);
      int rheight = height(node.right);
      if(lheight > rheight)
      {
        return lheight+1;
      }
      else{
        return rheight+1;
      }
    }
      
  }
  public static void printNode(Node node)
  {
    int height = height(node);
    for(int i =1;i<=height;i++)
    {
      printCurrentLevel(node,i);
    }
    
  }
    
    
  public static void printCurrentLevel(Node node,int height)
  {
    if(node == null)
    {
      return ;
    }
    else if(height == 1)
    {
      System.out.print(node.data+"  ");
    }
    else{
      printCurrentLevel(node.left,height-1);
      printCurrentLevel(node.right,height-1);
    }
  }
    
  
  public static void main(String[] args)
  {
    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    root.right.left = new Node(6);
    root.right.right = new Node(7);
    printNode(root);
    
  }
}
