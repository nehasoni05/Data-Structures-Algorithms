/*
Write a program to copy the elements of an array a to the another array b in reverse order.
Assume the size of array as 10. Each test case will have 10 elements in ten different lines.

Sample Input
3
10 
20 
4
7
1
2
3
4
5

Sample Output
5
4
3
2
1
7
4
20
10
3

*/

import java.util.Scanner;
// Other imports go here
class Copy_elements
{
  public static void main(String[] args)
  {
    Scanner in=new Scanner(System.in);
    int i,j=0;
    int[] a=new int[10],b=new int[10];
    for(i=0;i<10;i++)
      a[i]=in.nextInt();
    for(i=9;i>=0;i--)
    {
      b[j++]=a[i];
    }
    for(i=0;i<10;i++)
    System.out.println(b[i]);
  }
}
