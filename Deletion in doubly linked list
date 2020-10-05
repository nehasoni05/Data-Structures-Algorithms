import java.util.Scanner;
public class Main
{
    class Node 
    {
        int data;
        Node next=null;
        Node prev=null;
        public Node(int d)
        {
            data=d;
        }
    }
    public Node head=null;
    public Node tail=null;
    public void addNode(int val)
    {
        Node newnode=new Node(val);
        if(head==null)
        {
            head=newnode;
            tail=newnode;
            head.prev=null;
            tail.next=null;
        }
        else
        {
            tail.next=newnode;
            newnode.prev=tail;
            tail=newnode;
            tail.next=null;
        }
    }
    public void delete(int pos,int n)
    {
        if(pos==0)                            //delete node from head
        { 
            head=head.next;
            head.prev=null;
        }
        else if(pos==n-1)
        {
            tail=tail.prev;
            tail.next=null;
        }
        else
        {
            Node current=head;
            for(int i=0;i<pos;i++)
            current=current.next;
            current.prev.next=current.next;
            current.next.prev=current.prev;
        }
    }
    public void display()
    {
        Node current=head;
        while(current!=null)
        {
        System.out.print(current.data+" ");
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
	    System.out.println("Enter the elements ");
	    for(i=0;i<n;i++)
	    {
	        var=in.nextInt();
	        obj.addNode(var);
	    }
	    System.out.println("Linked list before deletion ->");
	    obj.display();
	    System.out.println("Do you want to delete any node in list?yes/no");
	    ch=in.next();
	    if(ch.equals("yes"))
	    {
	        System.out.println("Enter the position from where you want to delete the node:");
	        int pos;
	        pos=in.nextInt();
	        if(pos>=0 && pos<n)
	        {
	            obj.delete(pos,n);
	            System.out.println("Linked list after deletion ->");
	            obj.display();
	        }
	        else
	        {
	             System.out.println("Enter the valid position(from 0 to n-1)");
	        }
	    }
	}
}
