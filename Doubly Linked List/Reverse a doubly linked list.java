import java.util.Scanner;
public class Main
{
    class Node 
    {
        int data;
        Node previous=null;
        Node next=null;;
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
            head.previous=null;
            tail.next=null;
        }
        else
        {
            tail.next=newnode;
            newnode.previous=tail;
            newnode.next=null;
            tail=newnode;
        }
    }
    public void reverse()
    {
        Node temp=null;
        Node current=head;
       Node next=null;
        while(current!=null)
        {
            temp=current.previous;
            current.previous=current.next;
            current.next=temp;
            current=current.previous;
        }
        head=temp.previous;
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
	    System.out.println("Reverse of Linked list is ");
	    obj.reverse();
	    obj.display();
	}
}

