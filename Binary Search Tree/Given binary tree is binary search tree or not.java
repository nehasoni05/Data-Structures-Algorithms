/*
Given binary tree is binary search tree or not.
A binary tree is called binary search tree if it holds following three properties: -

a. The left subtree of a node contains nodes whose keys are less than that node’s key.
b. The right subtree of a node contains nodes whose keys are greater than that node’s key.
c. Both the left and right subtrees must also be binary search trees

﻿Sample Input
7
4 2 7 1 3 5 8

Sample Output
1
*/

import java.util.Scanner;

class Result {
  static int isBinarySearchTree(Node node) 
  {
    boolean res=isBST(node);
    if(res)
      return 1;
    else 
      return 0;
  }
  static boolean isBST(Node node)
  {
	if(node==null)
      return true;
    if(node.leftChild!=null && node.leftChild.data > node.data)
      return false;
    if(node.rightChild!=null && node.rightChild.data < node.data)
      return false;
    if(!isBST(node.leftChild) || !isBST(node.rightChild))
      return false;
    return true;
  }
}
class Node {
  int data; // data used as key value
  Node leftChild;
  Node rightChild;
  public Node()  {
    data=0;
  }
  public Node(int d)  {
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
  public static void main(String[] args)
  {
    int a[]=new int[10];
    int n, m, i;
    Scanner s=new Scanner(System.in);
    n = Integer.parseInt(s.nextLine());
    for(i=0;i<n;i++)
      a[i] = s.nextInt();
    Node root = null;
    if(n!=0)
      root = buildTree(a, n);
    System.out.println(Result.isBinarySearchTree(root));
  }
}
