/*
Sample input
Enter no. of elements you want in array:5
Enter all the elements:
2
3
3
4
3
Enter the k th position at which you want to check number:2

Sample output:
3

*/

import java.util.Scanner;

public class Main
{
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
          
        System.out.print("Enter the k th position at which you want to check number:");
        int k = in.nextInt(); 
    
          if(k>=n)
            System.out.print("Invalid value of k");
          else
            System.out.println("Number:"+a[k-1]);  
	}
}
