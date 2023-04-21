import java.util.*;

public class Main {
    public static boolean[] map = new boolean[26];
    
    public static void removeDuplicates(String str, int idx, String newStr){
        if(idx == str.length()){ // base case
            System.out.println(newStr);
            return;
        }
        
        char currChar = str.charAt(idx);
        if(map[currChar - 'a'] == true){
            
            removeDuplicates(str, idx+1, newStr);
        } else{
            newStr += currChar;
            map[currChar - 'a'] = true;
            removeDuplicates(str, idx+1, newStr);
        }
        
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		String newStr = "";
		
		removeDuplicates(str, 0, newStr);
		
	}
}
