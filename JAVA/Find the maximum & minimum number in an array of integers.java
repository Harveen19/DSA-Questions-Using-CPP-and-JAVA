import java.util.*;

public class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    
	    int[] numbers = new int[n];
	    
	    for(int i=0; i<n; i++){
	        numbers[i] = sc.nextInt();
	    }
	    
	    int max = Integer.MIN_VALUE;
	    int min = Integer.MAX_VALUE;
	    
	    for(int i=0; i<numbers.length; i++){
	        if(numbers[i] < min){
	            min = numbers[i];
	        }
	        
	        if(numbers[i] > max){
	            max = numbers[i];
	        }
	    }
	    
	    System.out.println("Largest number is: " + max);
	        
	    System.out.println("Smallest number is: " + min);
	}
}
