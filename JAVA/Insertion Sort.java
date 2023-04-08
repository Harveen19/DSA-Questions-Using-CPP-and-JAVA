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
	    
	    for(int i=1;i<arr.length;i++){
	        int current = arr[i];
	        int j = i-1; // using j for the sorted part
	        
	        while(j >= 0 && arr[j] > current){
	            // swapping
	            arr[j+1] = arr[j];
	            j--;
	        }
	        
	        arr[j+1] = current;
	    }
	   
	    printArray(arr);
	}
}
