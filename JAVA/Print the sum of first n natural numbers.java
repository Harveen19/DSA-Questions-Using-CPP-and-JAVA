import java.util.*;

public class Main {
    public static void printSum(int n, int sum, int i){
        if(i==n){ // base case
        sum += i;
        System.out.println(sum);
        return;
        }
        
        sum += i;
        printSum(n,sum,i+1);
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		printSum(n,0,1);
	}
}
