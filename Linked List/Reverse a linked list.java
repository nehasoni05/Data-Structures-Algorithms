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
    public void addNode(int d)
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
            
        }
    }
    public void reverse()
    {
        Node current=head;
        Node prev=null;
        Node next=null;
        while(current!=null)
        {
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        head=prev;
    }
    public void disp()
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
		Main obj=new Main();
	    Scanner in=new Scanner(System.in);
	    int i,n,var;
	    System.out.println("Enter the no. of elements you want to enter in linked list:");
	    n=in.nextInt();
	    System.out.println("Enter the elements you want to enter in linked list:");
	    for(i=0;i<n;i++)
	    {
	        var=in.nextInt();
	        obj.addNode(var);
	    }
	    System.out.println("Linked list is ");
	    obj.disp();
	    System.out.println("Reverse of Linked list is ");
	    obj.reverse();
	    obj.disp();
	}
}
