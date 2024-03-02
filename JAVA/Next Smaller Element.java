import java.util.*;
public class Main
{
    public static void nextSmaller(int arr[]){
        Stack<Integer> st = new Stack<>();
        int[] res = new int[arr.length];
        
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[st.peek()] < arr[i]){
                res[st.pop()] = arr[i];
            }
            
            st.push(i);
        }
        
        while(!st.isEmpty()){
            res[st.pop()] = -1; 
        } 
        
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
    
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		
        nextSmaller(arr);
	}
}
