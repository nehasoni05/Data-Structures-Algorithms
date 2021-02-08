/*
Move the Smallest and largest to head and tail of list
Given a pointer to the head node of a linked list, find the smallest and largest of this list. Now move the smallest node to the front and move the largest node to the end 
of the list.

Sample Input
1
7
12
8
6
20
1
50
16

Sample Output
1 12 8 6 20 16 50
*/


import java.util.*;
public class ShiftElements
{
    static class Node 
    {  
        int data;  
        Node next;  
    } 
    static Node head = null;
    static Node tail = null;  
    static Node findMin(Node head)
    {
      int min=Integer.MAX_VALUE;
      Node small=null;
      while(head!=null)
      {
        if(min>head.data)
        {
          min=head.data;
          small=head;
        }
        head=head.next;
      }
      return small;
    }
    static Node findMax(Node head)
    {
      int max=Integer.MIN_VALUE;
      Node large=null;
      while(head!=null)
      {
        if(max<head.data)
        {
          max=head.data;
          large=head;
        }
        head=head.next;
      }
      return large;
    }
    
    static Node shiftSmallLarge(Node org)
    {
      if(org==null || org.next==null)      //if no. of nodes are 0 or 1
        return org;
      
      if(org.data > org.next.data && org.next.next==null)      //if node1 data>node2 data and there are only two nodes 
      {
        int temp=org.data;
        org.data=org.next.data;
        org.next.data=temp;
        return org;
      }
      Node sNode=findMin(org);             //find smallest num
      Node lNode=findMax(org);			  //find largest num	
      
      Node tail=org;
      Node temp1 = org,temp2=org, prev1 = null,prev2=null;
      
      //insert small num at head and large num at tail
      while(tail.next!=null)
      {
        tail=tail.next;
      }
      	Node newnode1=new Node();
      	newnode1.data=sNode.data;
      	newnode1.next=org;
        org=newnode1;
      	
      	Node newnode2=new Node();
      	newnode2.data=lNode.data;
      	tail.next=newnode2;
        tail=newnode2;
        newnode2.next=null;
    
      //delete nodes
        
          while (temp1 != null && temp1.data != sNode.data)
          {
                prev1 = temp1;
                temp1 = temp1.next;
          }
          prev1.next = temp1.next; 
      	//  System.out.print(lNode.data);
          while(temp2!=null && temp2.data!=lNode.data)
          {
           prev2=temp2;
           temp2=temp2.next;
          }
          prev2.next=temp2.next;
      
      return org;
    }
    static void push(int data)
    {  
       
        Node newNode = new Node();  
        newNode.data=data;
          
        if(head == null)
        {  
             
            head = newNode;  
            tail = newNode;  
        }  
        else 
        {  
            tail.next = newNode;  
            tail = newNode;  
        }  
    }  
    static void printList(Node head)  
    {  
        while (head != null) {  
            System.out.print(head.data + " -> ");  
            head = head.next;  
        }  
         System.out.println();
    }  
	public static void main(String[] args) 
	{
	
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for(int i=0;i<n;i++)
        {
            push(in.nextInt());
        }
        System.out.println("Linked list is : ") ; 
        printList(head); 
        
        Node org=shiftSmallLarge(head);
        System.out.println("After shifting Linked list is : ") ; 
        printList(org); 
	}
}
