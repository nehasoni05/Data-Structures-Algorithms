import java.util.Scanner;

class Main
{
static void modifyMintoMax(int array[], int n)
{
   int i;
  for(i=(n-2)/2;i>=0;--i)
    maxheapify(array,i,n);
}
static void maxheapify(int array[],int i,int n)
{	
      int left=2*i+1;
      int right=2*i+2;
      int largest=i;
      if (left < n && array[left] > array[i]) 
            largest = left; 
        if (right < n && array[right] > array[largest]) 
            largest = right; 
        if (largest != i) 
        { 
            // swap arr[i] and arr[largest] 
            int temp = array[i]; 
            array[i] = array[largest]; 
            array[largest] = temp; 
           maxheapify(array,largest,  n); 
        } 
    
}
public static void main(String[] args)
 {
  int t, n, i, k;
  Scanner s=new Scanner(System.in);
  t=s.nextInt();
  while(t != 0)
  {
    n=s.nextInt();
    int[] a=new int[n];
    for(i=0;i<n;i++)
      a[i] = s.nextInt();
    modifyMintoMax(a,n);
    for(i=0;i<n;i++)
      System.out.print(a[i] + " ");
    System.out.println();
    t--;
  }
 }
}
