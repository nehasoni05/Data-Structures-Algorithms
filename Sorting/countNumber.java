/*
Find count of a number in a sorted list with duplicates
Given a sorted list of integers with duplicates, find the count of a given number.

Sample Input
3
10 5
1 2 2 5 5 5 7 7 7 8
10 1
1 1 1 1 1 1 1 2 2 3
20 2
1 1 1 1 1 2 2 2 2 2 3 3 3 3 3 4 4 4 4 4

Sample Output
3
7
5
*/

import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class countNumber
{
    public static void main(String[] args)
    {
        int i,n,t,count=0,k;
      	Scanner in=new Scanner(System.in);
      	t=in.nextInt();
      int[] a;
      while(t--!=0)
      {
        count=0;
        n=in.nextInt();
        k=in.nextInt();
        a=new int[n];
        for(i=0;i<n;i++)
          a[i]=in.nextInt();
        for(i=0;i<n;i++)
        {
          if(a[i]>k)
            break;
          else if(a[i]==k)
            count++;
        }
        System.out.println(count);
      }
      
    }
}
