// Write a function SmallLargeSum(array) which accepts the array as an argument or parameter, that performs the addition of the second largest element from the even location with the second largest element from an odd location?
// Rules:
// a. All the array elements are unique.
// b. If the length of the array is 3 or less than 3, then return 0.
// c. If Array is empty then return zero.

// Sample Test Case 1:
// Input:
// 6
// 3 2 1 7 5 4
// Output:
// 7

// Explanation: The second largest element in the even locations (3, 1, 5) is 3. The second largest element in the odd locations (2, 7, 4) is 4. So the addition of 3 and 4 is 7. So the answer is 7.

// Sample Test Case 2:
// Input:
// 7
// 4 0 7 9 6 4 2
// Output:
// 10

import java.util.*;
import java.io.*;
public class Main
{
    public static int large(int[] arr,int n){
        if(arr.length <= 3){
            return 0;
        }
        
        // Method 1
        // int evenFirst = Integer.MIN_VALUE;
        // int oddFirst = Integer.MIN_VALUE;
        // int evenSecond = Integer.MIN_VALUE;
        // int oddSecond = Integer.MIN_VALUE;
        
        // for(int i=0;i<n;i++){
        //     if(i%2==0){
        //         if(arr[i] > evenFirst){
        //             evenSecond = evenFirst;
        //             evenFirst = arr[i];
        //         }
        //         else if(arr[i] > evenSecond){
        //             evenSecond = arr[i];
        //         }
        //     }
        //     else{
        //         if(arr[i] > oddFirst){
        //             oddSecond = oddFirst;
        //             oddFirst = arr[i];
        //         }
        //         else if(arr[i] > oddSecond){
        //             oddSecond = arr[i];
        //         }
        //     }
        // }
        
        // if(evenSecond == Integer.MIN_VALUE || oddSecond == Integer.MIN_VALUE){
        //     return 0;
        // }
        
        // return evenSecond + oddSecond;
        
        // Method 2
        
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        
        even.add(arr[0]);
        
        for(int i=1;i<arr.length;i++){
            if(i % 2 == 0){
                even.add(arr[i]);
            } else {
                odd.add(arr[i]);
            }
        }
        
        Collections.sort(even);
        Collections.sort(odd);
        
        return even.get(even.size()-2) + odd.get(1);
    }
    
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n = s.nextInt();
		int[]arr = new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=s.nextInt();
		}
		System.out.println(large(arr,n));
	}
}
