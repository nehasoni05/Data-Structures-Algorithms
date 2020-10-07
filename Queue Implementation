import java.util.Scanner;
public class Main 
{
    int front=-1,rear=-1,maxSize;
    int[] queue;
    public Main(int l)
    {
        maxSize=l;
        queue=new int[maxSize];
    }
    public void enqueue(int var)
    {
        if(rear==maxSize)
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
    public void dequeue()
    {
        if(rear==-1)
        {
           System.out.println("Queue underflow");
           return; 
        }
        else
        {
            System.out.print(queue[front++]+" ");    
        }
    }
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int n,i;
        System.out.println("Enter the no. of elements you want to insert");
        n=in.nextInt();
        Main obj=new Main(n);
        System.out.println("Enter elements you want to insert");
        for(i=0;i<n;i++)
        {
            int var=in.nextInt();
            obj.enqueue(var);
        }
        System.out.println("Elements in queue are");
        for(i=0;i<n;i++)
        {
            obj.dequeue();
        }
    }
}
