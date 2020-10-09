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
            if(root==null)
            root=new Node(array[i]);
            
            root.leftChild=insert(array,root.leftChild,2*i+1,n);
            root.rightChild=insert(array,root.rightChild,2*i+2,n);
        }
        return root;
    }
    public void levelOrderTraversal(Node root)
    {
        Main obj=new Main();
        int level=1;
        while(printLevel(root,level))
        {
            System.out.println();
            level++;
        }
    }
    public boolean printLevel(Node root,int level)
    {
        if(root==null)
        return false;
        else if(level==1)
        {
            System.out.print(root.data+" ");
            return true;
        }
        else
        {
            boolean left=printLevel(root.leftChild,level-1);
            boolean right=printLevel(root.rightChild,level-1);
            return left||right;
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
	    
	    System.out.println("In-Order Traversal of binary tree is->");
	    obj.levelOrderTraversal(root);
	    
	    
	}
}
