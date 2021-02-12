/*
Merge 2 Sorted Arrays
Write a function mergeArrays which should merge two sorted arrays A and B to create one single sorted array.

Sample Input
4				      // Size of 1st array
1 2 3 6		    // Elements of 1st array
3				      // Size of 2nd array
4 5 7			    // Elements of 2nd array

Sample Output
1 2 3 4 5 6 7
*/


import java.util.Scanner;
class Merge2SortedArrays
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
      	int i,j,m,n,k=0;
      	m=in.nextInt();             //size of first array
      int[] a1=new int[m];
      for(i=0;i<m;i++)
        a1[i]=in.nextInt();
      
      n=in.nextInt();               //size of second array     
      int[] a2=new int[n];
      for(i=0;i<n;i++)
        a2[i]=in.nextInt();
      i=0;
      j=0;
      int[] a3=new int[m+n];
      while(i<m && j<n)
      {
        if(a1[i]<=a2[j])
          a3[k++]=a1[i++];
        else
          a3[k++]=a2[j++];
      }
      
      //remaining elements of a1 array
      while(i<m)
      {
        a3[k++]=a1[i++];
      }
      while(j<n)
      {
        a3[k++]=a2[j++];
      }
      for(i=0;i<m+n;i++)
        System.out.print(a3[i]+" ");
    }
}
