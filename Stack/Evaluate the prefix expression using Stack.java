import java.util.*;
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
    public int pop()
    {
        if(top==-1)
        {
            System.out.println("Stack underflow");
            return -1; 
        }
        else
       return stack[top--];
    }
    public int evalPrefix(String exp)
    {
        int op1,op2,i;
        Main obj=new Main(exp.length());
        for(i=exp.length()-1;i>=0;i--)
        {
            char c=exp.charAt(i);
            if(Character.isDigit(c))
            obj.push(c-'0');
            else
            {
                op1=obj.pop();
                op2=obj.pop();
                switch(exp.charAt(i))
                {
                    case '+':
                        obj.push(op1+op2);
                        break;
                    case '-':
                        obj.push(op1-op2);
                        break;  
                    case '*':
                        obj.push(op1*op2);
                        break;
                    case '/':
                        obj.push(op1/op2);
                        break;
                    case '^':
                        obj.push((int)Math.pow(op1,op2));
                        break;
                }
            }
        }
        int answer=obj.pop();
        return answer;
    }
    public static void main(String[] args)
    {
        int len,ans;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the expression");
        String str=in.nextLine();
        len=str.length();
        Main obj=new Main(len);
        ans= obj.evalPrefix(str);
        System.out.println("Result of prefix expression");
        System.out.println(ans);
    }
}
