// You are required to input the size of the matrix then the elements of matrix, then you have to divide the main matrix in two sub matrices (even and odd) in such a way that element at 0 index will be considered as even and element at 1st index will be considered as odd and so on. Then you have sort the even and odd matrices in ascending order and print the sum of second largest number from both the matrices.

// Example
// enter the size of array : 5
// enter element at 0 index : 3
// enter element at 1 index : 4
// enter element at 2 index : 1
// enter element at 3 index : 7
// enter element at 4 index : 9
// Sorted even array : 1 3 9
// Sorted odd array : 4 7
// Sum = 7


import java.util.*;
import java.io.*;

public class Main
{
    public static void submatrix(int arr[], int n){
        int[] even = new int[(n+1)/2];
        int[] odd = new int[n/2];
        
        int evenIdx = 0, oddIdx = 0;
        
        for(int i=0;i<n;i++){
            if(i % 2 == 0){
                even[evenIdx++] = arr[i];
            }
            else{
                odd[oddIdx++] = arr[i];
            }
        }
        
        Arrays.sort(even);
        Arrays.sort(odd);
        
        System.out.println("Sorted even array: " + Arrays.toString(even));
        System.out.println("Sorted odd array: " + Arrays.toString(odd));
        
        int evenSum = even.length >= 2 ? even[even.length - 2] : 0;
        int oddSum = odd.length >= 2 ? odd[odd.length - 2] : 0;
        
        System.out.println("Sum = " + (evenSum + oddSum));
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
        
    submatrix(arr,n);
        
	}
}
