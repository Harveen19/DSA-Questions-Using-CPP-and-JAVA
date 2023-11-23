// The given function has a string (str) and two characters, ch1 and ch2. Execute the function in such a way that str returns to its original string, and all the events in ch1 are replaced by ch2, and vice versa.
// Replacecharacter(Char str1, Char ch1, Int 1, Char ch2)

// Assumption

// This string has only alphabets that are in lower case.

// Example

// Input:
// str: apples
// ch1: a
// ch2: p

// Output:
// paales

// Explanation
// All the ‘a’ in the string is replaced with ‘p’. And all the ‘p’s are replaced with ‘a’.


import java.util.*;
public class Main
{
    public static String Replace(String str, char ch1, char ch2){
        char[] string = str.toCharArray();
        
        for(int i=0;i<str.length();i++){
            if(string[i] == 'a'){
                string[i] = ch2;
                
            }
            else if(string[i] == 'p'){
                string[i] = ch1;
            }
        }
        
        return new String(string);
    }
    
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		char ch1 = s.next().charAt(0);
		char ch2 = s.next().charAt(0);
		
		System.out.println(Replace(str,ch1,ch2));
	}
}
