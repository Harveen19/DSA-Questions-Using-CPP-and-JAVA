import java.util.*;

public class Main {
    public static void printPerm(String str, String perm, int idx){
        if(str.length() == 0){
            System.out.println(perm);
            return;
        }
        
        for(int i=0; i<str.length(); i++){
            char currChar = str.charAt(i);
            String newStr = str.substring(0,i) + str.substring(i+1);
            printPerm(newStr, perm + currChar, idx+1);
        }
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String perm = "";
		
		printPerm(str, perm, 0);
		
	}
}

// Time Complexity -> O(n*n!) where, n is the steps count and n! is the answer.
