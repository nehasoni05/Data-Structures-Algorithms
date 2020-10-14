import java.util.Scanner;
public class Main 
{
    int top=-1;
    int maxSize;
    char[] stack;
    public Main(int n)
    {
        maxSize=n;
        stack=new char[maxSize];
    }
    public void push(char val)
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

    public void pop()
    {
        if(top==-1)
        {
            System.out.println("Stack underflow");
            return; 
        }
        else
        System.out.print(stack[top--]);
    }
    public static void main(String[] args)
    {
       int i,len;
       
        Scanner in=new Scanner(System.in);
        String str;
        System.out.println("Enter the string ");
        str=in.nextLine();
        len=str.length();
        Main obj=new Main(len);
        for(i=0;i<len;i++)
        obj.push(str.charAt(i));
        System.out.println("Reverse of string ");
        for(i=0;i<len;i++)
        obj.pop();
    }
}
