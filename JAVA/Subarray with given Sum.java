import java.util.*;

public class Main {
    public static void subarraySum(int arr[], int n, int sum){
        for(int i=0;i<arr.length;i++){
            int currentSum = arr[i];
            
            if(currentSum == sum){
                System.out.println("Sum found at the index " + i);
            }
            else{
                // Try all subarrays starting with i
                for(int j=i+1;j<arr.length;j++){
                    currentSum += arr[j];
                    
                    if(currentSum == sum){
                        System.out.println("Sum found between indexes " + i + " and " + j);
                        return;
                    }
                }
            }
        }
        
        System.out.println("No subarray found");
        return;
    }
    
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int sum = sc.nextInt();
	    int arr[] = new int[n];
	    
	    for(int i=0;i<n;i++){
	        arr[i] = sc.nextInt();
	    }
	    
	    subarraySum(arr,n,sum);
	}
}
