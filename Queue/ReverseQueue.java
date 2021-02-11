/*
Reverse a given queue
Given a queue of integer elements, your task is to reverse it.

Sample Input
2
4
1 2 3 4
5
10 20 30 50 40

Sample Output
4 3 2 1
40 50 30 20 10
*/


import java.util.*;
class QueueArray
{
  static int SIZE=100;
  static int front=-1;
  static int rear=-1;
  static int array[]=new int[SIZE];

  // Method to add an item to the queue.
  void enqueue(int item)
  {
    if (rear == SIZE)   // Queue is full
      return;
    if(front == -1 && rear == -1){
      front++;
      rear++;
    }
    else
      rear++;
    array[rear] = item;
  }

  // Method to remove an item from queue.
  int dequeue()
  {
    if (front > rear)
    {
      return -1;
    }
    int item = array[front];
    front++;
    return item;
  }  
}

public class ReverseQueue
{
static void reverseQueue(QueueArray q)
{
 int[] arr= new int[q.SIZE];
    int i=0;
 while(q.front<q.rear)
  {
    arr[i]= q.dequeue();
   i++;
  }
  for(int j=i-1; j>=0; j--)
  {
    q.enqueue(arr[j]);
  }
System.out.println();
}
public static void main(String[] args)
{
  Scanner s=new Scanner(System.in);
  int t, n, q1, q2;
  t = s.nextInt();
  while(t>0)
  {
    QueueArray ob1=new QueueArray();
    n = s.nextInt();
    q2=n;
    while(n>0)
    {
      q1 = s.nextInt();
      ob1.enqueue(q1);
      n--;
    }
    reverseQueue(ob1);
    while(q2>0)
    {
      System.out.print(ob1.dequeue() + " ");
      q2--;
    }
    t--;
  }
  System.out.println();
}
}
