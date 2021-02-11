/*
Given a queue of integer elements and an integer k, your task is to reverse first k elements of the queue, leaving the other elements in same order.

Sample Input
4     //no. of elements 
1
2
3
4
2     //no. of elements you want to reverse
Sample Output

2 1 3 4
*/

import java.util.Scanner;
class Queue 
{
    static int front=-1;
    static int rear=-1;
    static int SIZE=10;
    static int[] queue=new int[SIZE];
    
    public void enqueue(int var)
    {
        if(rear==SIZE)
        {
            System.out.println("Queue overflow");
            return;
        }
        else
        {
        if(front==-1 && rear==-1)
        {
            front=0;
            rear=0;
        }
        else
        rear++;
        queue[rear]=var;
        }
    }
    public int dequeue()
    {
        if(rear==-1)
        {
           System.out.println("Queue underflow");
           return -1; 
        }
        else
        {
            return queue[front++];  
        }
    }
}
public class reverseFirstnElements
{
      static void reverseKelementsQueue(Queue q, int K)
      {
        if(K==0)
          return;
       int[] a1=new int[q.SIZE];
          int[] a2=new int[q.SIZE];
          int i,j,s1=0,s2=0;
          for(i=0;i<K;i++)
          {
            a1[s1++]=q.dequeue();
          }
          while(q.front<=q.rear)
          {
            a2[s2++]=q.dequeue();
          }
          q.front=-1;
          q.rear=-1;
          for(j=s1-1;j>=0;j--)
            q.enqueue(a1[j]);
          for(j=0;j<s2;j++)
            q.enqueue(a2[j]);
      }
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int n,i;
        System.out.println("Enter the no. of elements you want to insert");
        n=in.nextInt();
        Queue obj=new Queue();
        System.out.println("Enter elements you want to insert");
        for(i=0;i<n;i++)
        {
            int var=in.nextInt();
            obj.enqueue(var);
        }
        System.out.println("Elements the no. of elemnts you want to reverse");
        int N=in.nextInt();
    
        reverseKelementsQueue(obj,N);
         System.out.println("Elements after reversing N elemnts ");
         for(i=0;i<n;i++)
        {
            System.out.print(obj.dequeue()+" ");
        }
    }
}
