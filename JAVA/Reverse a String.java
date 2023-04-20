import java.io.*;
import java.util.*;

public class Solution {
    // Using Recursion
    public static void revString(String str, int idx){
        if(idx == 0){
            System.out.println(str.charAt(idx));
            return;
        }
        
        System.out.print(str.charAt(idx));
        revString(str, idx-1);
        
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		revString(str, str.length()-1);
		
		
	}
}

    // ITERATIVE METHOD
    public static void main(String[] args) {
        String nstr= "", str= " ReversE ";
        char ch;
        
        System.out.print("Original word: ");
	    System.out.println(" ReversE ");
	    
        for(int i=0;i<str.length();i++){
            ch = str.charAt(i); // extract each character
            nstr = ch + nstr; // adds each character in front of existing string
        }
        System.out.println("Reversed word: " + nstr);
    }
}

