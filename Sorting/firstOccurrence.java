/*
Find first occurrence of an integer in a sorted list with duplicates
Given a sorted list of integers, find the position of first occurrence of a given number K

Sample Input
3
10 4
1 2 4 4 4 4 5 8 9 10
15 7
1 2 3 3 5 6 7 7 7 7 7 8 8 8 8
9 1
-5 -4 -3 -2 -1 0 0 0 1

Sample Output
2
6
8
*/

import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class firstOccurrence
{
    public static void main(String[] args)
    {
       int i,n,t,count=0,k,c;
      	Scanner in=new Scanner(System.in);
      	t=in.nextInt();
      int[] a;
      while(t--!=0)
      {
        count=0;
        c=-1;
        n=in.nextInt();
        k=in.nextInt();
        a=new int[n];
        for(i=0;i<n;i++)
          a[i]=in.nextInt();
        for(i=0;i<n;i++)
        {
          if(a[i]==k)
          {
            c=i;
           	break;
          }
        }
        if(c!=-1)
         System.out.println(c);
        else
          System.out.println("-1"); 
      }
    }
}
