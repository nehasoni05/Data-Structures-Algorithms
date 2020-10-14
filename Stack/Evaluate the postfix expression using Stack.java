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
    public int evalPostfix(String exp)
    {
        int op1,op2,i;
        Main obj=new Main(exp.length());
        for(i=0;i<exp.length();i++)
        {
            char c=exp.charAt(i);
            if(Character.isDigit(c))
            obj.push(c-'0');
            else
            {
                op2=obj.pop();
                op1=obj.pop();
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
        String str=in.nextLine();
        len=str.length();
        Main obj=new Main(len);
        ans= obj.evalPostfix(str);
        System.out.println(ans);
    }
}
