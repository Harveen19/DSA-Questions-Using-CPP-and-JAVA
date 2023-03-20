import java.util.*;

public class Main {
    public static void factorial(int n){
        if(n < 0){
            System.out.println("Invalid nunmber");
        }
        
        int fact=1;
        for(int i=n; i>=1; i--){
            fact = fact * i;
        }
        
        System.out.println(fact);
    }
    
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    
	    factorial(n);
	}
}
