// Given an array of N integers where each value represents the number of chocolates in a packet. Each packet can have a variable number of chocolates. There are m students, the task is to distribute chocolate packets such that: 

// Each student gets one packet.
// The difference between the number of chocolates in the packet with maximum chocolates and the packet with minimum chocolates given to the students is minimum.
// Examples:

// Input : arr[] = {7, 3, 2, 4, 9, 12, 56} , m = 3 
// Output: Minimum Difference is 2 
// Explanation:
// We have seven packets of chocolates and we need to pick three packets for 3 students 
// If we pick 2, 3 and 4, we get the minimum difference between maximum and minimum packet sizes.

// Input : arr[] = {3, 4, 1, 9, 56, 7, 9, 12} , m = 5 
// Output: Minimum Difference is 6 

import java.util.*;
public class Main
{
    public static int chocolate(int[]arr, int m){
        if(arr.length == 0 || m == 0){
            return 0;
        }
        
        Arrays.sort(arr);
        if(arr.length-1 < m){
            return -1;
        }
        
        int min_diff = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            int next = i + m - 1;
            if(next >= arr.length){
                break;
            }
            
            int diff = arr[next] - arr[i];
            min_diff = Math.min(min_diff, diff);
        }
        
        return min_diff;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[]arr = new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		int m = sc.nextInt();
		System.out.println(chocolate(arr,m));
	}
}
