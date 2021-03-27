/*
Sample input
7
1 2 5 5 2 6 7
Sample output
1 2 5 6 7
*/

import java.util.*;
public class RemoveDuplicates{  
    public static int removeDuplicates(int arr[], int n){  
        if (n==0 || n==1){  
            return n;  
        }    
        int j = 0;//for next element  
        for (int i=0; i < n-1; i++){  
            if (arr[i] != arr[i+1]){  
                arr[j++] = arr[i];  
            }  
        }  
        arr[j++] = arr[n-1];  
        return j;  
    }  
       
    public static void main (String[] args) {  
       Scanner sc=new Scanner (System.in);
       int n=in.nextInt();
       int arr[]=new int[n];
       for(int i=0;i<n;i++)
       {
           arr[i]=sc.nextInt();
       }  
        int newlength = removeDuplicateElements(arr, n); 
        
        //printing array elements  
        for (int i=0; i<newlength; i++)  
           System.out.print(arr[i]+" ");  
    }  
}  
