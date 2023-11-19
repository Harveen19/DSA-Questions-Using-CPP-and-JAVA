// Write a function FindMaxInArray, which will find the greatest number from an array with its desired index? The greatest number and its desired index should be printed in separate lines.

// Sample Test Case:
// Input:
// 10
// 15 78 96 17 20 65 14 36 18 20

// Output:
// 96
// 2


import java.util.*;
public class Main{
    public static void FindMaxInArray(int arr[], int n){
        if(arr == null){
            return;
        }
        
        int maxElement = Integer.MIN_VALUE;
        int maxIndex = Integer.MIN_VALUE;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] > maxElement){
                maxElement = arr[i];
                maxIndex = i;
            }
        }
        
        System.out.println(maxElement);
        System.out.println(maxIndex);
    }
    
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        
        FindMaxInArray(arr,n);
    }
}
