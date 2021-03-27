/*
You are given a list of n-1 integers and these integers are in the range of 1 to n. There are no duplicates in the list. One of the integers is missing in the list. Write an
efficient code to find the missing integer

Sample input
7
1 2 4 6 3 7 8

Sample output
5
*/
import java.util.Scanner;
public class MissingNumber
{
    static int getMissingNo (int a[], int n)
    {
        int i, total;
     	total  = (n + 1) * (n + 2) / 2;
     	for ( i = 0; i < n; i++)
     	total - = a[i];
     	return total;
    }
    public static void main(String args[])
    {
      	Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] array=new int[n];
        
        for(int i=0;i<n;i++)
          array[i]=in.nextInt();
      
      	int miss = getMissingNo(array, n);
      	System.out.println("The number missing is : " + miss);
    }
}
