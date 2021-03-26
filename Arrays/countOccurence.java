/*
Sample input
Enter no. of elements you want in array: 5
Enter all the elements:
2
3
3
4
3
Enter the element of which you want to count number of occurrences:3

Sample output
3
*/

import java.util.Scanner;

public class countOccurence
{
    static int count(int[] a,int n,int x)
    {
        int count=0,i;
        for(i = 0; i < n; i++)
        {
            if(a[i] == x)
            {
                count++;
            }
        }
        return count;
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
          
        System.out.print("Enter the element of which you want to count number of occurrences:");
        int x = in.nextInt();  
          
        System.out.print(count(array,n,x));  
	}
}
