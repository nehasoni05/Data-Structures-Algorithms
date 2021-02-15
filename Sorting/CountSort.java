import java.util.Scanner;
public class CountSort
{
    public void countSort(int[] a,int n)
    {
        int indx,dec,i;
        int[] count=new int[9];
        int[] output=new int[n+1];
        for(i=0;i<n;i++)
        {
           indx=a[i];
           count[indx]++;
        }
        for(i=1;i<9;i++)
        {
            count[i]=count[i]+count[i-1];
        }
        for(i=n-1;i>=0;i--)
        {
            indx=a[i];
            dec=count[indx]-1;
            output[dec]=a[i];
            count[indx]=dec;
        }
         System.out.println("Sorted array is ");
	    for(i=0;i<n;i++)
        System.out.print(output[i]+" ");
    }
	public static void main(String[] args) 
	{
	    Main obj=new Main();
	    Scanner in=new Scanner(System.in);
	    int i,n;
	    System.out.println("Enter the no. of elements");
	    n=in.nextInt();
	    int[] array=new int[n];
	    System.out.println("Enter the elements");
	    for(i=0;i<n;i++)
	    {
	        array[i]=in.nextInt();
	    }
	    obj.countSort(array,n);
	   
	}
}
