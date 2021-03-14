/*
Task
The height of a binary search tree is the number of edges between the tree's root and its furthest leaf. You are given a pointer,root , pointing to the root of a binary search 
tree. Complete the getHeight function provided in your editor so that it returns the height of the binary search tree.

Sample Input

7
3
5
2
1
4
6
7
Sample Output

3
*/

import java.util.*;
import java.io.*;
class Node
{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class Solution
{
    public static int getHeight(Node root)
    {
          //Write your code here
        if(root==null)
        return -1;
        
        int left=getHeight(root.left);
        int right=getHeight(root.right);
        
        int height=1+Math.max(left,right);
        return height;
    }

	public static Node insert(Node root,int data)
  {
    if(root==null)
    {
            return new Node(data);
        }
        else
        {
            Node cur;
            if(data<=root.data)
            {
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int T=sc.nextInt();
            Node root=null;
            while(T-->0){
                int data=sc.nextInt();
                root=insert(root,data);
            }
            int height=getHeight(root);
            System.out.println(height);
        }	
}
