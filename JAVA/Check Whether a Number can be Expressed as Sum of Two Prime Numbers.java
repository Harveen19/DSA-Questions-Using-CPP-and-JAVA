import java.util.*;

public class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    
	    boolean flag = false;
	    for(int i=2; i <= n/2; i++){
	        
	        // condition for i to be a prime number as well as for n-i
	        if(checkPrime(i)){
	            if(checkPrime(n-i)){
	                // sum of 2 prime numbers
	                System.out.println(n + " " + "=" + " "+ i +" "+ "+" +" " + (n-i));
	                flag = true;
	            }
	        } 
	    }
	    
	    if(!flag){
	        System.out.println(n + " cannot be represent as the sum of teo prime numbers.");
	    }
	}
	
	public static boolean checkPrime(int n){
	   boolean isPrime = true;
	   for(int i=2; i <= n/2; i++){
	       if(n%i == 0){
	           isPrime = false;
	           break;
	       }
	   }
	   
	   return isPrime;
	}
}
