/*
Implement Priority Queue using Linked List
Implement the priority queue using linked list representation.

Output

The output for each test case will be space separated integers having -1 if the queue is empty else the element deleted from the queue.

Sample Input
1   // No. of test cases
4   // No. of queries
1   // Query type insert
10  // value
1   // priority
1   // Query type insert
20  // value
0   // priority
2   // Query type delete
2   // Query type delete

Sample Output
20 10

Explanation
1st query is 1 10 1, which inserts element 10 with priority 1 in queue,
2nd query is 1 20 0, which inserts element 20 with priority 0 in queue,
3rd query is 2, which will delete the highest priority element and print it i.e. 20
4th query is 2, which will delete the highest priority element and print it i.e. 10

*/

import java.util.*;
class QueueNode
{
  int data;
  int priority;
  QueueNode next;

  public QueueNode(int data, int p) 
  {
    this.data = data;
    this.priority = p;
  }
}
class PQueueLL
{
  public QueueNode front, rear;
  public void EnQueue(int data, int priority)
  {
    QueueNode temp = new QueueNode(data,priority);
    if(front==null)
    {
      front=temp;
      rear=temp;
      return;
    }
    if(front.priority>priority)
    {
      temp.next=front;
      front=temp;
    }
    else
    {
      QueueNode start=front;
      while(start.next!=null&&start.next.priority<priority)
      {
        start=start.next;
      }
      temp.next=start.next;
      start.next=temp;
    }
  }    

  public int DeQueue()
  {
    QueueNode temp;
    if(front!=null)
    {
      temp=front;
      front=front.next;
      return temp.data;
    }
    return 0;
  }    
}
class PriorityQueue
{
  public static void main(String[] args)
  {
    PQueueLL q=new PQueueLL();
    Scanner s=new Scanner(System.in);
    int t, n, q1, q2, q3;
    t = Integer.parseInt(s.nextLine().trim());
    while(t>0)
    {
      n = Integer.parseInt(s.nextLine().trim());
      while(n>0)
      {
        q1 = Integer.parseInt(s.nextLine().trim());
        if(q1 == 1)
        {
          q2 = Integer.parseInt(s.nextLine().trim());
          q3 = Integer.parseInt(s.nextLine().trim());
          q.EnQueue(q2, q3);
        }
        else
          System.out.print(q.DeQueue() + " ");
        n--;
      }
      System.out.println();
      t--;
    }
  }
}
