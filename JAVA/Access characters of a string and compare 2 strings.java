import java.util.*;

public class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

	    //String firstName = sc.next();
	    //String lastName = sc.next();
	    
	    //String fullName = firstName + " " + lastName;
	    
	    // Access characters of a String
	    //for(int i=0; i<fullName.length(); i++){
	        //System.out.println(fullName.charAt(i));
	    //}
	    
	    // Compare 2 Strings
	    String name1 = sc.next();
	    String name2 = sc.next();
	    
	    // Compare function checks three conditions
	    //1 s1 > s2 -> +ve value
	    //2 s1 < s2 -> -ve value
	    //3 s1 == s2 -> 0
	    
	    if(name1.compareTo(name2) == 0){
	        System.out.println("Strings are equal.");
	    }
	    else{
	        System.out.println("Strings are not equal.");
	    }
	    
		System.out.println();
	}
}

// Never use == to check string equality bcz in some cases it gives use the error
