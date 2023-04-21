import java.util.*;

public class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    
	    int[] numbers = new int[n];
	    
	    for(int i=0; i<n; i++){
	        numbers[i] = sc.nextInt();
	    }
	    
	    boolean isAscending = true;
	    
	    for(int i=0; i<numbers.length-1; i++){
	        if(numbers[i] > numbers[i+1]){ // condition for descending order
	            isAscending = false;
	        }
	    }
	    
	    if(isAscending){
	        System.out.println("The array is sorted in ascending order");
	    }
	    else{
	        System.out.println("The array is not sorted in ascending order");
	    }
	}
}


// Using Recursion With Optimised Approach
public class Main {
    public static boolean isSorted(int arr[], int idx){
        if(idx == arr.length-1){ // base case
            return true;
        }
        
        if(arr[idx] <= arr[idx+1]){
            // array is unsorted till now
            return false;
        }
        
        return isSorted(arr, idx+1);
        
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		for(int i=0;i<n;i++){
		    arr[i] = sc.nextInt();
		}
		
		System.out.println(isSorted(arr, 0));
		
	}
}

