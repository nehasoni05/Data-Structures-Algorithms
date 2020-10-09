import java.util.*;
public class Main
{
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
    public void inOrderTraversal(Node root)
    {
        if(root==null)
        return;
        
        inOrderTraversal(root.leftChild);
        System.out.print(root.data+" ");
        inOrderTraversal(root.rightChild);
    }
    public void preOrderTraversal(Node root)
    {
        if(root==null)
        return;
        
        System.out.print(root.data+" ");
        inOrderTraversal(root.leftChild);
        inOrderTraversal(root.rightChild);
    }
    public void postOrderTraversal(Node root)
    {
        if(root==null)
        return;
        
        inOrderTraversal(root.leftChild);
        inOrderTraversal(root.rightChild);
        System.out.print(root.data+" ");
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
	    
	    System.out.println("In-Order Traversal of binary tree is->");
	    obj.inOrderTraversal(root);
	    System.out.println();
	    
	    System.out.println("Pre-Order Traversal of binary tree is->");
	    obj.preOrderTraversal(root);
	    System.out.println();
	    
	    System.out.println("Post-Order Traversal of binary tree is->");
	    obj.postOrderTraversal(root);
	    
	}
}
