import java.util.*;
import java.io.*;

public class Main {
    static void checkPangram(String str){
        // converts the given string to lowercase
        str = str.toLowerCase();
        boolean allLetterPresent = true;
        
        for(char ch = 'a'; ch <= 'z'; ch++){
            // check if the string does not contain all the letters
            if(!str.contains(String.valueOf(ch))){
                allLetterPresent = false;
                break;
            }
        }
        
        // check if all the letters are present or not
        if(allLetterPresent){
            System.out.println("is a Pangram");
        }
        else{
            System.out.println("is not a Pangram");
        }
    }
    
	public static void main(String[] args) {
	    String str = "The quick brown fox jumps over the lazy dog";
	    checkPangram(str);
	}
}
