import java.util.*;

public class Main {
    public static void printSubseq(String str, int idx, String res){
        if(idx == str.length()){ // base case
            System.out.println(res);
            return;
        }
        
        char currChar = str.charAt(idx);
        
        // to be
        printSubseq(str, idx+1, res+currChar);
        
        // not to be
        printSubseq(str, idx+1, res);
    }
    
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String str = sc.next();
	    String res = "";
	    
		printSubseq(str, 0, res);
	}
}

// Time Complexity = O(2^n)
