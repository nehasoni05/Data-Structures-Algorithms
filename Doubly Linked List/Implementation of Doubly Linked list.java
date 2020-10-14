import java.util.Scanner;
public class Main
{
    class Node 
    {
        int data;
        Node prev;
        Node next;
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
    public void display()
    {
        Node current=head;
        while(current!=null)
        {
            System.out.print(current.data+" ");
            current=current.next;
        }
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
	    obj.display();
	    
	}
}
