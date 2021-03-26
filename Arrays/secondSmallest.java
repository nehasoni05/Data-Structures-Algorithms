/*
Sample Input
7 
5 4 7 6 2 3 1
Sample output
2
*/
import java.util.Scanner;

public class secondSmallest
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
       return a[1];  
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
