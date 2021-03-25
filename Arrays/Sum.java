/*
Sample Input
10  20 30 40 50

Output

Sum of all elements = 150
*/

import java.util.Scanner;
class Sum
{
  public static void main(String[] args)
  {
     Scanner in=new Scanner(System.in);
    int n,i,sum=0;
    n=in.nextInt();                         //enter no. of elements
    int[] array=new int[n];                 // allocating memory to array
    
    //scan elements of array
    for(i=0;i<n;i++)
      array[i]=in.nextInt();
    
    for(i=0;i<n;i++)
    {
      sum=sum+array[i];
    }
    System.out.println("Sum of all elements = "+sum);
  }
}
