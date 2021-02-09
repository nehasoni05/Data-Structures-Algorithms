/*
Find the minimum bracket reversals for balanced expression
Given an expression having only square brackets ‘[‘ and ‘]’. Find the minimum number of brackets reversals required to make the expression balanced. If expression cannot be made 
balanced, print -1 and if it is already balanced, print 0.

Sample Input 
[[[[

Sample Output 
2

*/

import java.util.*;
class Stack
{
  private int S;
  private char stackArr[];
  private int top;
  
  public Stack(int l)
  {
    S=l;
    stackArr=new char[S];
    top=-1;
  }
  public boolean isEmpty()
  {
    if(top==-1)
    {
      return true;
    }
    return false;
  }
  public boolean isFull()
  {
    if(top==(S-1))
    {
      return true;
    }
    return false;
  }
  public void push(char c)
  {
    if(!isFull())
    {
      stackArr[++top]=c;
    }
    else
    {
      System.out.println("overflow");
    }
  }
  public char pop()
  {
    if(!isEmpty())
    {
      return stackArr[top--];
    }
    return 'x';
  }
  public char peek()
  {
    if(!isEmpty())
    {
      return stackArr[top];
    }
    return 'x';
  }
}
class Result
{
  static int minReversal(String expr)         //Method that count minimum reversal for making an expression balanced. 
  {
	int len=expr.length();
    int i;
    if(len%2!=0)                              // length of expression must be even to make it balanced by using reversals.  
    {
      return -1;
    }
    else                                    
    {
      Stack ss=new Stack(len);                        
    for(i=0;i<len;i++)
    {
      char ch=expr.charAt(i);
      if(ch=='[')
      {
        ss.push('[');
      }
      else if(ch==']')
      {
        if(!ss.isEmpty())
        {
          char g=ss.peek();
          if(g=='[')
          {
            ss.pop();
          }
          else 
          {
            ss.push(']');
          }
        }
        else
        {
          ss.push(']');
        }
      }
    }
    int open=0,close=0;
        while(!ss.isEmpty())
    {
      char g=ss.pop();
      if(g=='[')
      {
        open++;
      }
      else
      {
        close++;
      }
    }
    int m=0,n=0;
    m=open/2;
    n=close/2;
    if(open%2!=0)
    {
      m++;
    }
    if(close%2!=0)
    {
      n++;
    }
    return (m+n);
  }
}
}
class minimum_bracket_reversals
{
    public static void main(String[] args)
    {
      Result obj=new Result();
      Scanner in=new Scanner(System.in);
      String str=in.next();                       //enter expression
      int res=obj.minReversal(str);
      System.out.print(res);
    }
}
