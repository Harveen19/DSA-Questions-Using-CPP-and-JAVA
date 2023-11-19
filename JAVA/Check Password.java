// Write a function CheckPassword(str) which will accept the string as an argument or parameter and validates the password. It will return true if the conditions are satisfied else it’ll return false?
// The password is valid if it satisfies the below conditions:
// a. It should contain at least 4 characters.
// b. At least 1 numeric digit should be present.
// c. At least 1 Capital letter should be there.
// d. Passwords should not contain space or slash(/).
// e. The starting character should not be a number.

// Sample Test Case:
// Input:
// bB1_89

// Output:
// true


import java.util.*;
public class Main
{
    public static boolean checkPass(String str){
        boolean digit = false, cap=false;
        boolean numStart = false, space=false;
        if(str.length() < 4){
            return false;
        }
        
        for(int i=0;i<str.length();i++){
            char[] array = str.toCharArray();
            
            if(array[i] >= '0' && array[i] <= '9'){
                digit=true;
            }
            else if(array[i] >= 'A' && array[i] <= 'Z'){
                cap=true;
            }
            
            if(array[i] == ' ' || array[i] == '/'){
                space=true;
            }
            else if(array[0] >= '0' && array[0] <= '9'){
                numStart=true;
            }
        }
            
        return digit && cap && !space && !numStart;
    }
    
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		for(int i=0;i<str.length();i++){
		    char ch = str.charAt(i);
		}
		
		System.out.println(checkPass(str));
	}
}
