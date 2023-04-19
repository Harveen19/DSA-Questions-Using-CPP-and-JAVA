import java.util.*;

public class Main {
    public static int power(int x, int n){
        if(n==0){ // base case 1
            return 1;
        }
        
        if(x==0){ // base case 2
            return 0;
        }
        
        int xPown_1 = power(x, n-1); // calculating n-1 
        int xPown = x * xPown_1;
        
        return xPown;
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();
		
		int result = power(x,n);
		System.out.println(result);
		
	}
}
