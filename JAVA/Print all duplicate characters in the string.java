import java.util.*;
import java.io.*;

public class Main
{
    public static void dup(String str){
        if(str == null){
            System.out.println("NULL");
            return;
        }
        
        if(str.isEmpty()){
            System.out.println("Empty");
            return;
        }
        
        if(str.length()==1){
            System.out.println("Single");
            return;
        }
        
        char[] words = str.toCharArray();
        Map<Character, Integer> mp = new HashMap<Character,Integer>();
        
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(mp.containsKey(ch)){
            mp.put(ch, mp.get(ch) + 1);
            }
            else{
            mp.put(ch,1);
            }
        }
        
        Set<Map.Entry<Character, Integer>> set = mp.entrySet();
        for(Map.Entry<Character, Integer> entry : set)
        if(entry.getValue() > 1)
        System.out.println(entry.getKey() + ", count = " + entry.getValue());
    }
    
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String str = sc.nextLine();
		dup(str);
	}
}
