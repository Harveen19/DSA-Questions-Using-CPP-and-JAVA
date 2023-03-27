// Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.

import java.util.*;

public class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    
	    String [] array = new String[n];
	    int toLength=0;
	    
	    for(int i=0; i<n; i++){
	        array[i] = sc.next();
	        toLength += array[i].length();
	    }
	    
		System.out.println(toLength);
	}
}
