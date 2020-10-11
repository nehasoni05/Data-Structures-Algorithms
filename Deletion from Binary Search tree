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
    //Build tree
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
    
    //Display Tree
    public void inorderTraversal()
    {
        dispInorder(root);
    }
    public void dispInorder(Node root)
    {
        if(root!=null)
        {
            dispInorder(root.left);
            System.out.print(root.data+" ");
            dispInorder(root.right);
        }
    }
    
    //Delete node from tree
    public void deleteNode(int var)
    {
       root=delete(root,var);
    }
    public Node delete(Node root,int var)
    {
        if(root==null)
        return null;
        
        if(var < root.data)                                    //found element in left tree
        root.left=delete(root.left,var);
        else if(var>root.data)                                 //found element in right tree
        root.right=delete(root.right,var);
        else
        {
            if(root.left==null && root.right==null)            //node with no child  
            return null;
            else if(root.left==null)                           //node with right child
            return root.right;
            else if(root.right==null)                          //node with left child
            return root.left; 
            else                                               //node with left and right child
            {
                root.data=minValue(root.right);                //find minvalue from right tree or if you want to find maxvalue then pass root.left
                root.right=delete(root.right,root.data);
            }
    
        }
        return root;
    }
    //find minvalue from right tree
    public int minValue(Node temp)
    {
        int min=temp.data;
        while(temp.left!=null)
        {
            min=temp.left.data;     //because minimum value always placed on left of tree
            temp=temp.left;
        }
        return min;
    }
    public static void main(String[] args)
	{
	    Main obj=new Main();
	    Node root=null;
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
		
		 //        45
	     //        /\
	     //     10   50
	     //     /\     \
	     //   7   12    90
		//suppose you want to delete leaf node i.e(7 or 12 or 90)
		System.out.println();
		System.out.println("enter the  leaf node you want to delete from tree");
        var=in.nextInt();
        obj.deleteNode(var);
        System.out.println("The inorder representation of binary search tree after deleting the leaf element is");
	    obj.inorderTraversal();
	    
	    //suppose you want to delete node with one child (i.e 50)
	    System.out.println();
        System.out.println("enter the  internal node with one child to delete it from tree");
        var=in.nextInt();
        obj.deleteNode(var);
        System.out.println("The inorder representation of binary search tree after deleting the leaf element is");
	    obj.inorderTraversal();
	    
	    //suppose you want to delete node with two child (i.e 10 or 45)
	    System.out.println();
        System.out.println("enter the  internal node with two child to delete it from tree");
        var=in.nextInt();
        obj.deleteNode(var);
        System.out.println("The inorder representation of binary search tree after deleting the leaf element is");
	    obj.inorderTraversal();
	}
}
