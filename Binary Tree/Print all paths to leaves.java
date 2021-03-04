/*
Sample Input

        1
       / \
      2    3
     / \  /
    4  5 6
Sample Output

1 2 4 2
1 2 5 2
1 3 6 2
3

Explanation

First path is from 1 to 4 having 2 edges, so 1 2 4 is path and 2 is length of it. 
Similarly for other two leaf nodes. And at last line total number of paths are printed.
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
  
static int countAllPaths=0; 
static void printAllPaths(Node root) 
{
	int[] path=new int[1000];
  	printPath(root,path,0);
  	
  //count paths
	// countLeaves(root);
  if(countAllPaths==0)
    return;
  	 System.out.print(countAllPaths);	
  	
}
static void printPath(Node root,int path[],int pathLength)
{
	if(root==null)
      return;
  	path[pathLength++]=root.data;
	if(root.leftChild==null && root.rightChild==null)
    {
      printPathArray(path,pathLength);
      countAllPaths++;
    }
  	else
    {
      printPath(root.leftChild,path,pathLength);
      printPath(root.rightChild,path,pathLength);
    }
}
static void printPathArray(int[] pathArr,int length)
{
  
  for(int i=0;i<length;i++)
    System.out.print(pathArr[i]+" ");
  System.out.println(length-1);
}
  public static void main(String[] args)
  {
    int a[]=new int[10];
    int n, i;
    Scanner s=new Scanner(System.in);
    n = Integer.parseInt(s.nextLine().trim());
    for(i=0;i<n;i++)
      a[i] = Integer.parseInt(s.nextLine().trim());
    Node root = null;
    if(n!=0)
      root = buildTree(a, n);
    printAllPaths(root);
  }
}
