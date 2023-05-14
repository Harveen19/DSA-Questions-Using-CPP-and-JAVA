import java.util.*;

public class Main {
    public static void conquer(int arr[], int sidx, int mid, int eidx){
        int merged[] = new int[eidx - sidx + 1];
        
        int idx1 = sidx;
        int idx2 = mid+1;
        int x = 0;
        
        // O(n)
        while(idx1 <= mid && idx2 <= eidx){
            if(arr[idx1] <= arr[idx2]){
                merged[x++] = arr[idx1++];
            } else {
                merged[x++] = arr[idx2++];
            }
        }
        
        while(idx1 <= mid){
            merged[x++] = arr[idx1++];
        }
        
        while(idx2 <= eidx){
            merged[x++] = arr[idx2++];
        }
        
        for(int i=0, j=sidx; i<merged.length; i++, j++){
            arr[j] = merged[i];
        }
    }
    
    public static void divide(int arr[], int sidx, int eidx){
        // sidx = starting index, eidx = ending index;
        if(sidx >= eidx){
            return;
        }
        
        // O(logn)
        int mid = sidx + (eidx - sidx)/2;
        divide(arr, sidx, mid);
        divide(arr, mid+1, eidx);
        conquer(arr, sidx, mid, eidx);
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i=0;i<n;i++){
		    arr[i] = sc.nextInt();
		}
		
		divide(arr, 0, n-1);
		
		// print
		for(int i=0; i<n; i++){
		    System.out.print(arr[i] + " ");
		}
		
		System.out.println();
	}
}

// Time Complexity : O(nlogn)
