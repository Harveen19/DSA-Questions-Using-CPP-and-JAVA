import java.util.*;

public class Main {
    public static int partition(int arr[], int low, int high){
        int pivot = arr[high];
        int i = low-1; // here i will track how amny elements are smaller than our pivot
        
        for(int j=low; j<high; j++){
            if(arr[j] < pivot){
                i++; // because we have got one more space free for storing smaller element
                
                // swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        
        //  for storing pivot on its right position
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i; // pivot index
    }
    
    public static void quickSort(int arr[], int low, int high){
        if(low < high){
            int pivot = partition(arr, low, high);
            
            quickSort(arr, low, pivot-1);
            quickSort(arr, pivot+1, high);
        }
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i=0;i<n;i++){
		    arr[i] = sc.nextInt();
		}
		
		quickSort(arr, 0, n-1);
		
		// print
		for(int i=0; i<n; i++){
		    System.out.print(arr[i] + " ");
		}
		
		System.out.println();
	}
}

// Time Complexity :- 
// 1. Worst Case : O(n^2)
// 2. Average Case : O(nlogn)

// Always remember = Worst Case ocuurs when pivot is always the smallest or the largest element.
