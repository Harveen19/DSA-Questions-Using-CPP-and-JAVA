import java.util.*;

public class Main {
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        
        System.out.println();
    }
    
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    
	    int arr[] = new int[n];
	    for(int i=0;i<n;i++){
	        arr[i] = sc.nextInt();
	    }
	    
	    for(int i=0;i<arr.length-1;i++){ // outer loop
	        int  smallest = i; // storing index of smallest element
	        for(int j=i+1;j<arr.length;j++){
	            if(arr[smallest] > arr[j]){
	                smallest = j;
	            }
	        }
	        
	        // swap
	        int temp = arr[smallest];
	        arr[smallest] = arr[i];
	        arr[i] = temp;
	    }
	    
	    printArray(arr);
	}
}

// Time Complexity = O(n^2)
