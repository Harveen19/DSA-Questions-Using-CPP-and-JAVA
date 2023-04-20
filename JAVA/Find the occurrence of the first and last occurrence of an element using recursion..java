import java.io.*;
import java.util.*;

public class Main {
    public static int first = -1;
    public static int last = -1;
    
    public static void findOccurrence(String str, int idx, char ele){
        if(idx == str.length()){ // base case
            return;
        }
        
        char currChar = str.charAt(idx);
        if(currChar == ele){
            if(first == -1){
                first = idx;
            }
            else{
                last = idx;
            }
        }
        
        findOccurrence(str, idx+1, ele);
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char ele = sc.next().charAt(0);
        findOccurrence(str, 0, ele);
        
        System.out.println("First occurence : " + first);
        System.out.println("Last occurence : " + last);
    
    }
}

// Time Complexity = O(n)
