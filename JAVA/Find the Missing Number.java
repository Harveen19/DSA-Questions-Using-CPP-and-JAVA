// Given an array arr[] of size N-1 with integers in the range of [1, N], the task is to find the missing number from the first N integers.

// Examples: 

// Input: arr[] = {1, 2, 4, 6, 3, 7, 8, 9} N = 8
// Output: 5
// Explanation: The missing number between 1 to 8 is 5

// Input: arr[] = {1, 2, 3, 5, 6} N = 5
// Output: 4
// Explanation: The missing number between 1 to 5 is 4

import java.util.*;

public class Main
{
    // Using first N natural numbers
    public static int getMissing(int arr[], int n){
        int sumTotal = ((n+1) * (n+2))/2;
        for(int i=0; i<arr.length; i++){
            sumTotal -= arr[i];
        }
        
        return sumTotal;
    }
    
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		
		for(int i=0;i<n;i++){
		    arr[i]=s.nextInt();
		}
		
		System.out.println(getMissing(arr,n));
	}
}
