import java.util.*;

public class Main {
    public static void printSubseq(String str, int idx, String res, HashSet<String>set){
        if(idx == str.length()){ // base case
            
            if(set.contains(res)){
                return;
            }
            else{
                System.out.println(res);
                set.add(res);
                return;
            }
        }
        
        char currChar = str.charAt(idx);
        
        // to be
        printSubseq(str, idx+1, res+currChar, set);
        
        // not to be
        printSubseq(str, idx+1, res, set);
    }
    
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String str = sc.next();
	    String res = "";
	    
	    HashSet<String> set = new HashSet<>();
	    
		printSubseq(str, 0, res, set);
	}
}

// Time Complexity = O(2^n)
