import java.util.Scanner;
public class Main
{
    class Node 
    {
        int data;
        Node next=null;
        public Node(int d)
        {
            data=d;
        }
    }
    public Node head=null;
    public Node tail=null;
    public void addnode(int d)
    {
        Node newnode=new Node(d);
        if(head==null)
        {
            head=newnode;
            tail=newnode;
            newnode.next=null;
        }
        else
        {
            tail.next=newnode;
            tail=newnode;
            newnode.next=null;
        }
    }
    public void insert(int pos,int value,int n)                //n is no. of nodes
    {
        Node newnode=new Node(value);
        if(pos==0)                                            //Insertion in beginning
        {
            newnode.next=head;
            head=newnode;
        }
        else if(pos==n)                                      //Insertion at end 
        {
            tail.next=newnode;
            tail=newnode;
            newnode.next=null;
        }
        else                                                //Insertion at any node in linked list
        { 
            Node current=head;
            for(int i=0;i<pos-1;i++)
            {
            current=current.next;
            }
            newnode.next=current.next;
            current.next=newnode;
        }
    }
    public void disp()
    {
        Node current=head;
        while(current!=null)
        {
            System.out.print(current.data+"->");
            current=current.next;
        }
        System.out.println();
    }
	public static void main(String[] args) 
	{
	    int i,n,var;
	    String ch;
	    Main obj=new Main();
	    Scanner in=new Scanner(System.in);
	    System.out.println("Enter no. of elements you want to insert ");
	    n=in.nextInt();
	    for(i=0;i<n;i++)
	    {
	        var=in.nextInt();
	        obj.addnode(var);
	    }
	    System.out.println("Linked list before insertion ->");
	    obj.disp();
	    System.out.println("Do you want to insert any node in list?yes/no");
	    ch=in.next();
	    if(ch.equals("yes"))
	    {
	        System.out.println("Enter the position where you want to insert the node:");
	        int pos;
	        pos=in.nextInt();
	        if(pos>=0 && pos<=n)
	        {
	            System.out.println("Enter the element you want to insert:");
	            var=in.nextInt();
	            obj.insert(pos,var,n);
	            System.out.println("Linked list after insertion ->");
	            obj.disp();
	        }
	        else
	        {
	             System.out.println("You are not able to insert at position "+pos);
	        }
	    }
	}
}
