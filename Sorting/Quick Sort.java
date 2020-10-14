import java.util.Scanner;
public class Main
{
    public void quickSort(int[] arr,int first,int last)
    {
        Main obj=new Main();
        if(first<last)
        {
        int pivot=obj.partition(arr,first,last);
        obj.quickSort(arr,first,pivot-1);
        obj.quickSort(arr,pivot+1,last);
        }
    }
    
    public int partition(int[] a,int low,int high)
    {
        int i,j,pivot,temp;
        pivot=a[high];
        i=low-1;
        for(j=low;j<high;j++)
        {
            if(a[j]<pivot)
            {
                ++i;
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
        temp=a[i+1];
        a[i+1]=a[high];
        a[high]=temp;
        return i+1;
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
	    obj.quickSort(array,0,n-1);
	    System.out.println("Sorted array is ");
	    for(i=0;i<n;i++)
        System.out.print(array[i]+" ");
	}
}
