import java.io.*;
import java.util.*;

class Solution{
    public static void sort012(int a[], int n){
        int low=0;
        int high= n-1;
        int mid=0;
        int count=0;
        
        // Iterate till all elements are sorted
        while(mid <= high){
            switch(a[mid]){
                case 0: {
                    count = a[low];
                    a[low]= a[mid];
                    a[mid]= count;
                    low++;
                    mid++;
                    break;
                }
                
                case 1: {
                    mid++;
                    break;
                }
                
                case 2: {
                    count = a[mid];
                    a[mid] = a[high];
                    a[high] = count;
                    high--;
                    break;
                }
            }
        }
    }
    
    static void printArray(int a[], int n){
        for(int i=0;i<n;i++){
            System.out.print(a[i]+ " ");
        }
    } 
    
    public static void main(String[] args){
        int a[]= {0,2,1,2,0,0,1};
        int n= a.length;
        
        sort012(a,n);
        printArray(a,n);
    }
}
