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
            newnode.next=null;
            tail=newnode;
        }
    }
    public void insert(int pos,int val,int n)
    {
        Node newnode=new Node(val);
        if(pos==1)                    //insertion node at head
        {
            newnode.prev=null;
            newnode.next=head;
            head.prev=newnode;
            head=newnode;
        }
        else if(pos==n)            //insertion at tail
        {
            tail.next=newnode;
            newnode.prev=tail;
            newnode.next=null;
            tail=newnode;
        }
        else                           //insertion at any node
        {
            Node temp=null;
            Node current=head;
            for(int i=1;i<pos-1;i++)
            current=current.next;
            temp=current.next;
            current.next=newnode;
            newnode.prev=current;
            newnode.next=temp;
            current.next.next.prev=newnode;
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
	    Main obj=new Main();
        int i,n,var,pos,val;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter no. of elements ");
        n=in.nextInt();
        System.out.println("Enter elements ");
        for(i=0;i<n;i++)
        {
            var=in.nextInt();
            obj.addNode(var);
        }
        System.out.println("Linked list is ");
        obj.display();
        System.out.println("Enter pos. where you want to insert the element ");
        pos=in.nextInt();
        System.out.println("Enter element ");
        val=in.nextInt();
        obj.insert(pos,val,n);
        System.out.println("After insertion Linked list is ");
        obj.display();
	    
	}
}
