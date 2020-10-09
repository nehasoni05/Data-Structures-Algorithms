import java.util.*;
public class Main
{
    int count_Leaves=0;
    int count_non_Leaves=0;
    class Node 
    {
        int data;
        Node leftChild;
        Node rightChild;
        public Node(int d)
        {
            data=d;
        }
    }
    public Node buildTree(int[] a,int n)
    {
        Main obj=new Main();
        Node node=null;
        node=obj.insert(a,node,0,n);
        return node;
    }
    public Node insert(int[] array,Node root,int i,int n)
    {
        if(i<n)
        {
            root=new Node(array[i]);
            root.leftChild=insert(array,root.leftChild,2*i+1,n);
            root.rightChild=insert(array,root.rightChild,2*i+2,n);
        }
        return root;
    }
    public void countLeafs(Node root)
    {
        if(root==null)
        return;
        else
        {
          if(root.leftChild==null && root.rightChild==null)
          {
            count_Leaves++;
          }
          countLeafs(root.leftChild);
          countLeafs(root.rightChild);
        }
    }
    public void countnonLeafs(Node root)
    {
        if(root==null)
        return;
        else
        {
          if(root.leftChild!=null || root.rightChild!=null)
          {
            count_non_Leaves++;
          }
          countnonLeafs(root.leftChild);
          countnonLeafs(root.rightChild);
        }
    }
    public static void main(String[] args) 
	{
	    Main obj=new Main();
	    Node root=null;
	    int n,i;
	    Scanner in=new Scanner(System.in);
	    System.out.println("Enter the no. of elements you want to insert in binary tree");
	    n=in.nextInt();
	    
	    int[] arr=new int[n];
	    System.out.println("Enter the elements");
	    for(i=0;i<n;i++)
	    arr[i]=in.nextInt();
	    
	    root=obj.buildTree(arr,n); 
	    
	    obj.countLeafs(root);
	    obj.countnonLeafs(root);
	    System.out.println("Count of leaves "+obj.count_Leaves);
	    System.out.println("Count of parents "+obj.count_Leaves);
	}
	
}
