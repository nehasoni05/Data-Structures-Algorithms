import java.util.Scanner;

class Main
{
static int isMaxHeap(int arr[], int n)
{
   int i,flag=0,L=0,j=0;
  int[] a=new int[n+1];
  for(i=1;i<=n;i++)
  {
    a[i]=arr[j++];
  }
  //find largest element in array
  for(i=1;i<=n;i++)
  {
    if(a[i]>L)
      L=a[i];
  }
  
  //if largest elemnt is at first position
  if(L==a[1])
  {
    if(n<=3)
    {
      flag=1;
    }
    else
    for(i=2;i<n/2;i++)
    {
      int l=2*i;
      int r=2*i+1;
      if(a[i]>a[l] && a[i]>a[r])
        flag=1;
      else
      {
        flag=0;
        break;
      }
    }
  }
  else
      flag=0;
  
  if(flag==0)
    return 0;
  else
    return 1;
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
    System.out.println(isMaxHeap(a, n));
    t--;
  }
 }
}
