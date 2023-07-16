import java.util.*;

public class Main
{
    public static int longestSubarraySum(int arr[], int n, int k){
        int max_len = 0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum += arr[j];
                
                if(sum % k == 0){
                    max_len = Math.max(max_len, j-i+1);
                }
            }
        }
        
        return max_len;
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		
		int k = sc.nextInt();
		System.out.println(longestSubarraySum(arr,n,k));
	}
}
