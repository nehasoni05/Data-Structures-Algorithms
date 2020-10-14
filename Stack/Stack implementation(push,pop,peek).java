import java.util.Scanner;
public class Main 
{
    int top=-1;
    int maxSize;
    int[] stack;
    public Main(int n)
    {
        maxSize=n;
        stack=new int[maxSize];
    }
    public void push(int val)
    {
        if(top==maxSize)
        {
        System.out.println("Stack overflow");
        return;
        }
        else
        top++;
        stack[top]=val;
    }
    public void peek()
    {
        System.out.println("Topmost element in stack is->"+stack[top]);
    }
    public void pop()
    {
        if(top==-1)
        {
            System.out.println("Stack underflow");
            return; 
        }
        else
        System.out.print(stack[top--]+",");
    }
    public static void main(String[] args)
    {
        int n,var,i;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the no. of elements you want to enter in stack ");
        n=in.nextInt();
        Main obj=new Main(n);
        System.out.println("Enter the elements");
        for(i=1;i<=n;i++)
        {
            var=in.nextInt();
            obj.push(var);                      //push the variable into stack
        }
        obj.peek();                             //check the topmost value in stack
        for(i=1;i<=n;i++)
        {
            obj.pop();                          //delete values from stack
        }
    }
}
