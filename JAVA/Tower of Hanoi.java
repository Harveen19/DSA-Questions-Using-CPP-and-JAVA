import java.util.*;

public class Main {
    public static void towerOfHanoi(int n, String src, String helper, String dest){
        if(n==1){ // base case
            System.out.println("transfer disk " + n + " from " + src + " to " + dest);
            return;
        }
        
        // first to transfer n-1 disks from source to helper
        towerOfHanoi(n-1, src, dest, helper);
        System.out.println("transfer disk " + n + " from " + src + " to " + dest);
        
        towerOfHanoi(n-1, helper, src, dest);
        
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		towerOfHanoi(n, "S", "H", "D");
	}
}