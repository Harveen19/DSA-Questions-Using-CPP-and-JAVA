import java.util.*;

public class Main {
    public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
    
    public static void printKeypadComb(String str, int idx, String res){
        if(idx == str.length()){ // base case
            System.out.println(res);
            return;
        }
        
        char currChar = str.charAt(idx);
        String mapping = keypad[currChar - '0'];
        
        for(int i=0; i<mapping.length(); i++){
            printKeypadComb(str, idx+1, res+mapping.charAt(i));
        }
    }
    
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String str = sc.next();
	    String res = "";
	    
	    printKeypadComb(str, 0, res);
	}
}
