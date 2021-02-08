/*
Given a pointer to the head node of a linked list, find the middle node & Nth node from end of the list.

findMiddle(head) : Return the middle node if number of nodes in linked list in odd, otherwise there will be two middle nodes and return the second middle node 
(return -1 if list is empty).

Sample Input
5                    // Total elements in the list for test-case-1
1 2 3 4 5            // Elements of the list for test-case-1
2                    // Value of N

Sample Output

3
4

*/

import java.util.*;
public class MiddleAndNthFromLastofList
{
    static class Node 
    {  
        int data;  
        Node next;  
    } 
    static Node head = null;
    static Node tail = null;  

    static int length(Node current)
    {
      int count=0;
      while(current!=null)
      {
        current=current.next;
        count++;
      }
      return count;
    }
    static int findMiddle(Node head) 
    {
        if(head==null)
          return -1;
        int count=0;
        int mid=head.data;
        Node current=head;
        count=length(current);  //length of linked list

         current=head;
        int i=0;
        while(i!=count/2+1)
        {
          mid=current.data;
          current=current.next;
          i++;
        }
        return mid;
    }

    static int findNLast(Node head, int n)
    {
      if(head==null || head.next==null)
        return -1;

       Node current=head;
       int count=length(current);
       if (count <= n)
       {
         while(current.next!=null)
         {
           current=current.next;
         }
         return current.data;
       }
       else
       {
         for (int i = 1; i < count - n + 1; i++)
                current = current.next;
         return current.data;
       }

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
        int nLast=in.nextInt();                            //scan n last element
        System.out.println("Linked list is : ") ; 
        printList(head); 
        
        System.out.println("middle of linked list :"+findMiddle(head));                  //middle of linked list
        System.out.println("nLast element of linked list :"+findNLast(head,nLast));                   //nLast 
	}
}
