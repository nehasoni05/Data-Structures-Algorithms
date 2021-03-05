/*
Given an array of integer elements, create a binary tree from this array in level order fashion.

Sample Input
1 2 3 4 5 6

Sample Output
4 2 5 1 6 3
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
 
static Node buildTree(int[] a,int n)
{
        Node node=null;
        node=insert(a,node,0,n);
        return node;
}
static Node insert(int[] array,Node root,int i,int n)
{
  if(i<n)
  {
     if(root==null)
     root=new Node(array[i]);
            
     root.leftChild=insert(array,root.leftChild,2*i+1,n);
     root.rightChild=insert(array,root.rightChild,2*i+2,n);
  }
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
    root = buildTree(a, n);
    inOrder(root);
  }
}
