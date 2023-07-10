// Given an array arr[] of distinct elements size N that is sorted and then rotated around an unknown point, the task is to check if the array has a pair with a given sum X.

// Examples : 

// Input: arr[] = {11, 15, 6, 8, 9, 10}, X = 16
// Output: true
// Explanation: There is a pair (6, 10) with sum 16

// Input: arr[] = {11, 15, 26, 38, 9, 10}, X = 35
// Output: true
// Explanation: There is a pair (26, 9) with sum 35

// Input: arr[] = {11, 15, 26, 38, 9, 10}, X = 45
// Output: false
// Explanation: There is no pair with sum 45.


import java.util.*;

public class Main{
    public static boolean findPairSum(int arr[], int k){
        int n = arr.length;
        
        int pivot = 0;
        for(int i=0;i<n-1;i++){
            if(arr[i] > arr[i+1]){
                pivot = i+1;
                break;
            }
        }
        
        int left = pivot;
        int right = pivot-1;
        
        while(left != right){
            if(arr[left] + arr[right] == k){
                return true;
            }
            else if(arr[left] + arr[right] < k){
                left = (left+1) % n;
            }
            else{
                right = (right-1+n) % n;
            }
        }
        
        return false;
    }
    
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        
        int k = s.nextInt();
        System.out.println(findPairSum(arr,k));
    }
}
