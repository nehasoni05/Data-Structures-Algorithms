import java.util.Scanner;
public class Main 
{
    public void insertionSort(int[] a,int n)
    {
        int i,j,temp;
        for(i=1;i<n;i++)
        {
            temp=a[i];
            for(j=i-1;j>=0 && a[j]>temp;j--)
            {
                a[j+1]=a[j];
            }
            a[j+1]=temp;
        }
        System.out.println("Sorted array is ");
        for(i=0;i<n;i++)
	    {
	        System.out.print(a[i]+" ");
	    }
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
	    obj.insertionSort(array,n);
	}
}
