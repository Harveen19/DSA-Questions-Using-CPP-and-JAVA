import java.util.*;
public class Main
{
    public static void find(String s){
        Set<Character> set = new HashSet<>();
        Set<Character> uniqueset = new HashSet<>();
        
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                if(!set.contains(ch))
                set.add(ch);
                uniqueset.add(ch);
            }
        }
        
        if(uniqueset.isEmpty()){
            System.out.println(-1);
        }
        
        for(char c : uniqueset){
            System.out.print(c + " ");
        }
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine().toLowerCase();
		find(s);
	}
}
