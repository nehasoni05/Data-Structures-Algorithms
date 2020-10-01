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
    public void delete(int pos,int n)                //n is no. of nodes
    {
        if(pos==0)
        {
            head=head.next;
        }
        else if(pos==n)
        {
            Node current=head;
             while (current != tail)
             {
                current = current.next;
             }    
            current.next = null;
            tail = current;
        }
        else
        {
            Node current=head;
            for(int i=0;i<pos-1;i++)
            {
                current=current.next;
            }
            Node next=current.next.next;
            current.next=next;
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
	    System.out.println("Linked list before deletion ->");
	    obj.disp();
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
	            obj.disp();
	        }
	        else
	        {
	             System.out.println("Enter the valid position(from 0 to n-1)");
	        }
	    }
	}
}
