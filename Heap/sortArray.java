/*Sort an array using heap sort
Given an array of N integers, sort them in ascending order using heap sort. Write the two functions heapify() and heapSort(), to implement the heap.

Sample Input
7
1 3 5 7 2 4 9

Sample Output
1 2 3 4 5 7 9

*/

public class sortArray 
{
  public static void heapSort(int array[], int n) 
  {
    for(int i=n/2-1;i>=0;i--)
      heapify(array,n,i);
    
    for(int i=n-1;i>=0;i--)
    {
      int temp=array[i];
      array[i]=array[0];
      array[0]=temp;
      heapify(array,i,0);
    }
  }
  
    public void heapify(int arr[], int n, int i)
    {
        int max=i;
        int left=2*i+1;
        int right=2*i+2;

        if(left<n && array[left]>array[max])
          max=left;

        if(right<n && array[right]>array[max])
          max=right;

        if(max!=i)
        {
          int temp=array[i];
          array[i]=array[max];
          array[max]=temp;
          heapify(array,n,max);
        }
    }
    
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
 
    public static void main(String args[])
    {
        int arr[] = { 12, 11, 13, 5, 6, 7 };
        int n = arr.length;
 
        HeapSort ob = new HeapSort();
        ob.sort(arr);
 
        System.out.println("Sorted array is");
        printArray(arr);
    }
}
