/*
In this program, we need to rotate the elements of an array towards the left by the specified number of times. 
In the left rotation, each element of the array will be shifted to its left by one position and the first element of the array will be added to end of the list.

Sample Input:
Enter no. of elements you want in array:5                                                                                                       
Enter all the elements:                                                                                                                         
1 2 3 4 5                                                                                                                                       
Enter no. of rotations: 1

Sample output:
Original array:                                                                                                                                 
1 2 3 4 5                                                                                                                                       
Array after left rotation:                                                                                                                      
2 3 4 5 1   
*/

import java.util.Scanner;

public class rotateLeft
{
    static void rotate(int[] a,int n,int r)
    {
        for(int i = 0; i < r; i++)
        {  
            int j, first;  
            first = a[0];  
            for(j = 0; j <n-1; j++)
            {  
                a[j] = a[j+1];  
            }  
            a[j] = first;  
        }  
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
          
        System.out.print("Enter no. of rotations: ");
        int r=in.nextInt();  
         
        System.out.println("Original array: ");  
        for (i = 0; i < n; i++) 
        {  
            System.out.print(array[i] + " ");  
        }    
        
        rotate(array,n,r);  
        
        System.out.println();
        System.out.println("Array after left rotation: ");  
        for(i = 0; i< n; i++)
            System.out.print(array[i] + " ");
	}
}
