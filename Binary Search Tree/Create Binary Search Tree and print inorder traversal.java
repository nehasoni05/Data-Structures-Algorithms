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
    public void inorderTraversal()
    {
        dispInorder(root);
    }
    public void dispInorder(Node root)
    {
        if(root==null)
        return;
        else
        dispInorder(root.left);
        System.out.print(root.data+" ");
        dispInorder(root.right);
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
		System.out.println("Inorder traversal of BST is ");
		obj.inorderTraversal();
		
	}
}
