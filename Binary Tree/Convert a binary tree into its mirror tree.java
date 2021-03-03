/*
Sample Input

        1
       / \
      2    3
     / \  /
    4  5 6
Sample Output
       1
      / \
     3   2
     \  / \
      6 5  4

3 6 1 5 2 4
*/

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
  static void inOrder(Node root)
  {
    if (root != null)
    {
      inOrder(root.leftChild);
      System.out.print(root.data + " ");
      inOrder(root.rightChild);
    }
  }
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
  
static Node findMirror(Node root)
{
	if(root==null)
      return null;
  	Node newLeft;
  	Node newRight;
  	newLeft=findMirror(root.leftChild);
    newRight=findMirror(root.rightChild);

    //swap
    root.leftChild=newRight;
    root.rightChild=newLeft;
  return root;
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
    root = findMirror(root);
    inOrder(root);
  }
}
