import java.util.*;
public class Main
{
    int maxSize;
    int size=0;
    int[] heap;
    public Main(int n)
    {
        maxSize=n;
        heap=new int[n+1];
        heap[0]=Integer.MAX_VALUE;
    }
    
    //build heap
    public int parent(int pos)
    {
        return pos/2;
    }
    public void swap(int cpos,int ppos)
    {
        int temp=heap[cpos];
        heap[cpos]=heap[ppos];
        heap[ppos]=temp;
    }
    public void buildHeap(int item)
    {
        heap[++size]=item;
        int current=size;
        while(heap[current]>heap[parent(current)])
        {
            swap(current,parent(current));
            current=parent(current);
        }
    }
    public void printHeap()
    {
        for(int i=1;i<=size/2;i++)
        {
            System.out.println("Parent "+heap[i]+" Left Child: "+heap[2*i]+" Right Child "+heap[2*i+1]);
        }
    }
    
    //remove element from heap
    public int left(int pos)
    {
        return 2*pos;
    }
    public int right(int pos)
    {
        return 2*pos+1;
    }
    public boolean isLeaf(int pos)
    {
        if(pos>=size/2 && pos<=size)
        return true;
        else
        return false;
    }
    public void heapfiy(int pos)
    {
        if(!isLeaf(pos))
        {
            if(heap[pos] < heap[left(pos)] || heap[pos] < heap[right(pos)])
            {
                if(heap[pos]<heap[left(pos)])
                {
                    swap(pos,left(pos));
                    heapfiy(left(pos));
                }
                else
                {
                    swap(pos,right(pos));
                    heapfiy(right(pos));
                }
            }
        }
    }
    public int remove()
    {
        int t=heap[1];
        heap[1]=heap[size--];
        heapfiy(1);
        return t;
    }
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		int n,i,var;
		System.out.println("Enter no. of elements you want to insert in heap ");
		n=in.nextInt();
		Main obj=new Main(n);
		System.out.println("Enter elements you want to insert in heap ");
		for(i=0;i<n;i++)
		{
		    var=in.nextInt();
		    obj.buildHeap(var);
		}
		obj.printHeap();
		System.out.println("Remove element from heap ");
		int d=obj.remove();
		System.out.println("Deleted element is "+d);
		System.out.println("After deletion heap is ");
		obj.printHeap();	
	}
}
