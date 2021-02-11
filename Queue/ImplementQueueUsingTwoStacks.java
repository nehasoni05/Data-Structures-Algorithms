/*
Implement Queue using two stacks
In this question, given two stacks you have to implement a queue using them. In other words, you are allowed to do push and pop on these two stacks only, but the effect
outside must come as a FIFO list (queue).
Sample Input-
First line of input contains an integer Q denoting the number of queries.
A Query is of 2 Types
(a) 1 item  (a query of this type means insert 'item' into the queue)
(b) 2    (a query of this type means to delete element from queue and print the deleted element)
The second line of each test case contains Q queries separated by space.

Sample Output
The output for each test case will be space separated integers having -1 if the queue is empty else the element deleted from the queue.

Sample Input
8
1 3 2 1 4 1 2 2 1 6 2 2

Sample Output
3 4 2 6

*/

import java.util.*;
class CQStack
{
  int maxSize; // size of stack array
  int[] stackArray;
  int top; // top of stack

  public CQStack() // constructor
  {
    maxSize = 100; // set array size
    stackArray = new int[maxSize]; // create array
    top = -1; // no items yet
  }
  public void push(int j) // put item on top of stack
  {
    if(isFull())
    {
    }
    else
      stackArray[++top] = j; // increment top, insert item
  }
  public int pop() // take item from top of stack
  {
    if (isEmpty())
    {
      return -1;
    }
    else
    {
      int temp=stackArray[top--];
      return temp; // access item, decrement top
    }
  }
  public boolean isEmpty() // true if stack is empty
  {
    return (top == -1);
  }
  public boolean isFull() // true if stack is full
  {
    return (top == maxSize-1);
  }
}
/* push(int), pop(), isEmpty(), isFull() are available on Stack. */
class Queue
{
  void enqueue(CQStack st1, CQStack st2, int item)
  {
	while(!st1.isEmpty())
    {
       st2.push(st1.pop()); 
    }
    st1.push(item); 
    while (!st2.isEmpty())  
    {  
       st1.push(st2.pop());  
    } 
  }

  int dequeue(CQStack st1, CQStack st2)
  {
	if (st1.isEmpty())  
    {  
      
     return -1; 
    }   
        return st1.pop();
  }
}
public class Main
{
  public static void main(String[] args)
  {
    Scanner s=new Scanner(System.in);
    int t, n, q1, q2, k;
    t = Integer.parseInt(s.nextLine());
    Queue qa1 = new Queue();
    CQStack st1=new CQStack();
    CQStack st2=new CQStack();
    while(t>0)
    {
      q1 = s.nextInt();
      if(q1 == 1)
      {
        q2 = s.nextInt();
        qa1.enqueue(st1, st2, q2);
      }
      else
        System.out.print(qa1.dequeue(st1, st2) + " ");
      t--;
    }
    System.out.println();
  }
}
