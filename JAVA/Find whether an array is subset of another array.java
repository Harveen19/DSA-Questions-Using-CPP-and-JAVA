import java.util.*;
public class Main{
    public static boolean subset(int arr1[], int arr2[], int n, int m){
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr2[j]==arr1[i]){
                    break;
                }
            }
            if(i==n)
              return false;
        }
        return true;
    } 
    
    public static void main(String args[]){
        int arr1[] = { 11, 1, 13, 21, 3, 7 };
        int arr2[] = { 11, 3, 7, 1 };
        
        int n= arr1.length;
        int m= arr2.length;
        
        if(subset(arr1,arr2,n,m)){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }
    }
}
