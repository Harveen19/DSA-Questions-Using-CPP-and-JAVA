import java.io.*;
import java.util.*;

public class Solution {
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
