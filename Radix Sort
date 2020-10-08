import java.util.Scanner;
public class Main
{
    public static void countSort(int[] a,int n,int p)
    {
        int ind,dec,i;
        int[] count=new int[10];
        int[] output=new int[n+1];
        for(i=0;i<n;i++)
        {
            ind=(a[i]/p)%10;
            count[ind]++;
        }
        
        for(i=1;i<10;i++)
        {
            count[i]=count[i]+count[i-1];
        }
        
        for(i=n-1;i>=0;i--)
        {
            ind=(a[i]/p)%10;
            dec=count[ind]-1;
            output[dec]=a[i];
            count[ind]=dec;
        }
         for(i=0;i<n;i++)
         a[i]=output[i];
    }
    public static void radixSort(int[] ar,int n)
    {
        int l=-1,i;
        for(i=0;i<n;i++)
        {
            if(l<ar[i])
            l=ar[i];
        }
        for (i = 1; l/i > 0; i *= 10) 
        countSort(ar, n, i);
        
    }
	public static void main(String[] args) 
	{
		int n,i;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter no. of elements ");
		n=in.nextInt();
		int[] a=new int[n];
		System.out.println("Enter elements ");
		for(i=0;i<n;i++)
		a[i]=in.nextInt();
		radixSort(a,n);
		 System.out.println("Sorted array is ");
        for(i=0;i<n;i++)
        System.out.print(a[i]+" ");
	}
