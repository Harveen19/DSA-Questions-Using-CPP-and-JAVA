import java.util.*;
public class Main{
    public static boolean check(int arr[],int n,int x){
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==x){
                    return true;
                }
            }
        }
        return false;
    }
    
    public static void main(String[] args){
        int arr[]= {0,-1,2,3,-5};
        int x= 5;
        int n= arr.length;
        
        if(check(arr,n,x)){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }
    } 
}
