/*
Sample input
Enter no. of elements you want in array:5
Enter all the elements:
2
3
3
4
3

Sample output
4
*/

import java.util.Scanner;

public class Main
{
    static int find(int[] a,int n)
    {
        int max = a[0];
        for(int i = 0; i < n; i++)
        {
            if(max < a[i])
            {
                max = a[i];
            }
        }
        return max;
    }
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
        int n,i;
        System.out.print("Enter no. of elements you want in array:");
        n=in.nextInt();                         //enter no. of elements
        int[] array=new int[n];                 // allocating memory to array
        
        //scan elements of array
        System.out.println("Enter all the elements:");
        for(i=0;i<n;i++)
          array[i]=in.nextInt();
          
          
        System.out.println("Largest Number in an array:-"+find(array,n));  
	}
}
