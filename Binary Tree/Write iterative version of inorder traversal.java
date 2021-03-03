import java.util.Scanner;
class Node
{
  int data; // data used as key value
  Node leftChild;
  Node rightChild;
  public Node()
  {
    data=0;
  }
  public Node(int d)
  {
    data=d;
  }
}

class Main
{
  static Node insertLevelOrder(int arr[], Node root, int i, int n)
  {
    if (i < n)
    {
      Node temp = new Node(arr[i]);
      root = temp;
      root.leftChild = insertLevelOrder(arr, root.leftChild, 2 * i + 1, n);
      root.rightChild = insertLevelOrder(arr, root.rightChild, 2 * i + 2, n);
    }
    return root;
  }

  static Node buildTree(int t[], int n)
  {
    Node node = null;
    node = insertLevelOrder(t, node, 0, n);
    return node;
  }
  
static void printInorder(Node root)
{
	if (root == null)
    return;
	Node current, pre;
  
    current = root;
	while (current != null) 
	{
		if (current.leftChild == null) 
        {
          System.out.print(current.data + " ");
          current = current.rightChild;
        }
        else
        {
         	pre = current.leftChild;
            while (pre.rightChild != null && pre.rightChild != current)
                    pre = pre.rightChild;
                if (pre.rightChild == null) 
                {
                    pre.rightChild = current;
                    current = current.leftChild;
                }
                else
                {
                    pre.rightChild = null;
                    System.out.print(current.data + " ");
                    current = current.rightChild;
                } 
            }
        } 
}
public static void main(String[] args)
  {
    int a[]=new int[10];
    int n, i;
    Scanner s=new Scanner(System.in);
    n = Integer.parseInt(s.nextLine());
    for(i=0;i<n;i++)
      a[i] = Integer.parseInt(s.nextLine());
    Node root = null;
    if(n!=0)
      root = buildTree(a, n);
    printInorder(root);
  }
}  
