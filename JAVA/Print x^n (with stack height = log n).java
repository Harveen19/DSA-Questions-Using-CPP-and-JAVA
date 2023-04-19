import java.util.*;

public class Main {
    public static int calPower(int x, int n){
        if(n==0){ // base case 
            return 1;
        }
        
        // if n is even
        if(n % 2 == 0){
            return calPower(x, n/2) * calPower(x, n/2);
        }
        else{ // if n is odd
            return calPower(x, n/2) * calPower(x, n/2) * x;
        }
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();
		
		int result = calPower(x,n);
		System.out.println(result);
		
	}
}
