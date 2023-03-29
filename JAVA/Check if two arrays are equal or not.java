import java.util.*;
import java.io.*;

public class Main {
    public static boolean areEqual(int arr1[], int arr2[]){
        int n = arr1.length;
        int m = arr2.length;
        
        if(n != m){
            return false;
        }
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        for(int i=0; i<n; i++){
            if(arr1[i] == arr2[i]){
                return true;
            }
        }
        return false;
    }
    
	public static void main(String[] args) {
	    int[] arr1 = { 1,2,3,4,5,6 };
	    int[] arr2 = { 4,7,1,2,5 };
	    
	    if(areEqual(arr1,arr2)){
	        System.out.println("Arrays are equal");
	    }
	    else{
	        System.out.println("Arrays are not equal");
	    }
	}
}
