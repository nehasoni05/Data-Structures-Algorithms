import java.util.Scanner;
public class Main 
{
    public void selectionSort(int[] a,int n)
    {
        int i,j,indx,temp;
        for(i=0;i<n-1;i++)
        {
          indx=i;
          for(j=i+1;j<n;j++)
          {
              if(a[j]<a[indx])
              indx=j;
          }
          temp=a[i];
          a[i]=a[indx];
          a[indx]=temp;
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
	    obj.selectionSort(array,n);
	}
}
