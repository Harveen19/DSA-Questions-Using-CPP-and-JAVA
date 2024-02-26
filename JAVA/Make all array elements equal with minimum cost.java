import java.util.*;
public class Main
{
    public static int cost(int arr[], int n, int x){
        int cost = 0;
        for(int i=0;i<n;i++){
            cost += Math.abs(arr[i] - x);
        }
        return cost;
    }
    
    public static int minimum(int arr[], int n){
        int low = arr[0];
        int high = arr[0];
        
        for(int i=0;i<n;i++){
            if(low > arr[i]){
                low = arr[i];
            }
            if(high < arr[i]){
                high = arr[i];
            }
        }
        
        while((high - low) > 2){
            int mid1 = low + (high - low) / 3;
            int mid2 = high - (high - low) / 3;
            
            int cost1 = cost(arr, n, mid1);
            int cost2 = cost(arr,n,mid2);
            
            if(cost1 < cost2){
                high = mid2;
            } else {
                low = mid1;
            }
        }
        
        return cost(arr,n, (low + high) / 2);
    }
    
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=s.nextInt();
		}
		
		System.out.println(minimum(arr,n));
	}
}
