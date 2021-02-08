/*
Reverse Alternate K nodes of Linked List
Given a pointer to the head node of a linked list and an integer K, reverse every alternate K nodes in an efficient way.

Complete the function revAltKNodes() which takes the head node of a linked list & an integer K as parameters and return the head of modified list after reversing all
alternative K nodes of the list.

Sample Input
1
6
1 2 3 4 5 6
2

Sample Output
2 1 3 4 6 5
*/

import java.util.*;
public class Main
{
    static class Node 
    {  
        int data;  
        Node next;  
    } 
    static Node head = null;
    static Node tail = null;  
    static Node revAltKNodes (Node head, int K) 
    {
	   Node current=head;
     Node prev=null;
     Node next=null;
    int count=0;
    //reverse K nodes
     while(current!=null && count<K)
     {
        next=current.next;
        current.next=prev;
        prev=current;
        current=next;
        count++;
     }
    //point the head to (K+1)th node
     if(head!=null)
     {
       head.next=current;
     } 
     //skip next K nodes because we have to reverse alternate K nodes
      count = 0; 
      while (count < K - 1 && current != null) 
      { 
         current = current.next; 
         count++; 
       } 
  
       // Recursively call for the list starting from current->next.
       if (current != null) 
       { 
           current.next = revAltKNodes(current.next, K); 
       } 
	  return prev;
  }
  //insert elements in linked list
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
    //print list
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
        int k=in.nextInt();                         //scan K
        System.out.println("Linked list is : ") ; 
        printList(head); 
        
        Node org=revAltKNodes(head,k);
        System.out.println("After shifting Linked list is : ") ; 
        printList(org); 
	}
}
