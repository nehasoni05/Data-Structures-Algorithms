import java.util.Scanner;
public class Main
{
    class Node 
    {
        int data;
        Node left;
        Node right;
        public Node(int d)
        {
            data=d;
        }
    }
    public Node root=null;
    public void buildTree(int var)
    {
        root=insert(root,var);
    }
    public Node insert(Node root,int var)
    {
        if(root==null)
        {
            root=new Node(var);
            return root;
        }
        else
        {
            if(var<root.data)
            root.left=insert(root.left,var);
            else
            root.right=insert(root.right,var);
            
            return root;
        }
    }
    public Node search(int key)
    {
        Node temp=dosearch(root,key);
        return temp;
    }
    public Node dosearch(Node root,int key)
    {
        if(root==null || root.data==key)
        return root;
        else
        {
            if(key<root.data)
            return dosearch(root.left,key);
            else
            return dosearch(root.right,key);
        }
        
    }
	public static void main(String[] args)
	{
	    Main obj=new Main();
		int i,var,n;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the no. of elements you want to insert in tree");
		n=in.nextInt();
		System.out.println("Enter the elements ");
		for(i=0;i<n;i++)
		{
		    var=in.nextInt();
		    obj.buildTree(var);
		}
		System.out.println("Enter the element you want to search ");
		var=in.nextInt();
		Node temp=obj.search(var);
	    if(temp!=null)
	    System.out.println(var + " found in the tree");
	    else
	    System.out.println(var + " not found in the tree");
	}
}
