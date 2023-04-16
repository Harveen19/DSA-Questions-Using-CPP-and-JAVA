import java.util.*;

public class Main {
    public static int factorial(int n){
        if(n==0 || n==1){ // base case
            return 1;
        }
        
        // first we will calculate n-1 factorial
        int fact = factorial(n-1);
        int fact_n = n * fact;
        return fact_n;
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int ans = factorial(n);
		System.out.println(ans);
	}
}
