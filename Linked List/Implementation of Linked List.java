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
            newnode.next=null;
        }
    }
    public void disp()
    {
        while(head!=null)
        {
            System.out.print(head.data+"->");
            head=head.next;
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
	    obj.disp();
	}
}
