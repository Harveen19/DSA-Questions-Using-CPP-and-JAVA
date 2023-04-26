import java.util.*;

public class Main {
    public static int tiles(int n, int m){
        if(n == m){ // base case 1
            return 2;
        }
        
        if(n < m){ // base case 2
            return 1;
        }
        
        // vertically placed
        int vertPlaced = tiles(n-m, m);
        
        // horizontally placed
        int horzPlaced = tiles(n-1, m);
        
        return vertPlaced + horzPlaced;
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		System.out.println(tiles(n, m));
	}
}
