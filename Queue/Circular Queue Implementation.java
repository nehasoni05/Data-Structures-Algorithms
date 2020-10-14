import java.util.Scanner;
public class Main 
{
    int front=-1,rear=-1,SIZE;
    int[] queue;
    public Main(int l)
    {
        SIZE=l;
        queue=new int[SIZE];
    }
    public void enqueue(int item)
    {
        if ((front == 0 && rear == SIZE-1) || (rear == (front-1)%(SIZE-1))) 
        {  
         return;
        }
        if(front == -1 && rear==-1)	
        {
          front = rear = 0;
        } 
        else if (rear == SIZE-1 && front != 0)	 
        rear = 0;
        else		  
        rear++;
    
        queue[rear] = item;
    }
    
    public void dequeue()
    {
        if (front == -1)
        {
          return;
        }
        int item = queue[front];
        if (front == rear)
          front = rear = -1;
        else if (front == SIZE-1)
          front = 0;
        else
          front++;
        System.out.print(item+",");
    }
    public static void main(String[] args)
    {
        
        Scanner in=new Scanner(System.in);
        int n,i;
        System.out.println("Enter no. of elements you want to insert ");
        n=in.nextInt();
        Main obj=new Main(n);
        System.out.println("Insert elements in queue ");
        for(i=0;i<n;i++)
        {
            int var=in.nextInt();
            obj.enqueue(var);
        }
        System.out.println("Enter no. of elements you want to delete ");
        int d=in.nextInt();
        System.out.println("Deleted elements from queue ");
        for(i=0;i<d;i++)
        {
            obj.dequeue();
        }
        System.out.println();
        System.out.println("insert new elements");
        for(i=0;i<d;i++)
        {
            int var=in.nextInt();
            obj.enqueue(var);
        }
        System.out.println("elements in queue is->");
        for(i=0;i<n;i++)
        {
            obj.dequeue();
        }
    }
}
