import java.io.*;
import java.util.*;

class Solution {
    public static int binarySearch(int arr[], int n, int k) {
        int s=0, e=arr.length-1;
        
        while(s <= e){
            int mid= (s+e)/2;
            if(arr[mid] == k){
                return mid;
            }
            else if(arr[mid]<k){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return -1;
    }
    
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5};
        int k= 3;
        int result = binarySearch(arr,5,k);  
        if (result == -1)  
            System.out.println("Element is not found!");  
        else  
            System.out.println("Element is found at index: "+result);
    }
}
