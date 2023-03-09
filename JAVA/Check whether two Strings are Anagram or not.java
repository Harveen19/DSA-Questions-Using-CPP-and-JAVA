import java.util.*;
import java.io.*;
import java.util.Arrays;

class Main{    
    
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(char[] str1, char[] str2){
        if(str1.length != str2.length){
            return false;
        }
            
            Arrays.sort(str1);
            Arrays.sort(str2);
        
        for(int i=0;i<str1.length;i++){
            if(str1[i] != str2[i]){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String args[]){
        char str1[] = { 'a', 'l', 'l', 'e', 'r', 'g', 'y' };
        char str2[] = { 'a', 'l', 'l', 'e', 'r', 'g', 'i', 'c' };
        
        // Function Call
        if (isAnagram(str1, str2))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
