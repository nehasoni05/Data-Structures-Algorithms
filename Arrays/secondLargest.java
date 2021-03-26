/*
Sample input:
7
4 5 2 3 6 1 7

Sample output
6
*/

import java.util.Scanner;

public class secondLargest
{
    static int find(int[] a,int n)
    {
        int temp;  
        for (int i = 0; i < n; i++)   
        {  
            for (int j =0; j<n-i-1; j++)   
            {  
                if (a[j]>a[j+1])   
                {  
                    temp = a[j];  
                    a[j] = a[j+1];  
                    a[j+1] = temp;  
                }  
            }  
        }  
       return a[n-2];  
    }
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
        int n,i;
        n=in.nextInt();                         //enter no. of elements
        int[] array=new int[n];                 // allocating memory to array
        
        //scan elements of array
        for(i=0;i<n;i++)
          array[i]=in.nextInt();
          
        System.out.print(find(array,n));  
	}
}
