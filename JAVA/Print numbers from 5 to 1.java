import java.util.*;

public class Main {
    public static void printNumbers(int n){
        if(n==0){ // base case
            return;
        }
        
        System.out.println(n);
        printNumbers(n-1); // recursion
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		printNumbers(n);
	}
}
