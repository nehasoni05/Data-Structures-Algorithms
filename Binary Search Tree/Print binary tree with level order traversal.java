/*
Given a binary tree, print all nodes of the tree in level order traversal. print nodes at same level separated by space and give new line between every level. 
(There should be no space after last node of each level.)

Sample Input

        1
       / \
      2    3
     / \  /
    4  5 6
Sample Output

1
2 3
4 5 6
*/

import java.util.*;
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
  
static void printLevelWise(Node root)
{
if(root==null)
  return;

  Queue<Node> queue = new LinkedList<>(); 
  queue.add(root);
  while(true)
  {
    int nodeCount = queue.size(); 
    if(nodeCount == 0) 
       break; 
    while(nodeCount > 0) 
    { 
     	Node node = queue.peek(); 
        System.out.print(node.data); 
        queue.remove(); 
        if(node.leftChild != null) 
          queue.add(node.leftChild); 
        if(node.rightChild != null) 
           queue.add(node.rightChild); 
         nodeCount--; 
      if(nodeCount> 0)
        System.out.print(" ");
     } 
     System.out.println(); 
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
    printLevelWise(root);
  }
}
  
