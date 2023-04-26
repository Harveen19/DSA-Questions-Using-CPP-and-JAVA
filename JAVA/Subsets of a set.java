import java.util.*;

public class Main {
    public static void printSubsets(ArrayList<Integer> subset){
        for(int i=0; i<subset.size(); i++){
            System.out.print(subset.get(i) + " ");
        }
        System.out.println();
    }
    
    public static void findSubsets(int n, ArrayList<Integer> subset){
        if(n == 0){ // base case
            printSubsets(subset);
            return;
        }
        
        // to add
        subset.add(n);
        findSubsets(n-1, subset);
        
        // not to add
        subset.remove(subset.size()-1);
        findSubsets(n-1, subset);
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> subset = new ArrayList<>();
		
		findSubsets(n, subset);
	}
}

// Time Complexity -> O(2^n)
