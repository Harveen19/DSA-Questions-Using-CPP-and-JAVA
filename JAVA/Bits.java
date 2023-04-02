import java.util.*;

public class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int oper = sc.nextInt();
	    
	    int n = 5;
	    int pos = 1;
	   
	    int bitMask = 1<<pos;
	    
	    // Get Bit
	    /*if((bitMask & n) == 0){
	        System.out.println("bit was zero");
	    }
		else{
		    System.out.println("bit was one");
		} */
		
		// Set bit
		/*int newNumber = bitMask | n;
		System.out.println(newNumber); */
		
		// Clear bit
		/*int newBitMask = ~(bitMask);
		int newNumber = newBitMask & n;
		System.out.println(newNumber); */
		
		// Update bit
		if(oper == 1){
		    // set
		    int newNumber = bitMask | n;
		    System.out.println(newNumber);
		}
		
		else{
		    // clear
		    int newBitMask = ~(bitMask);
		    int newNumber = newBitMask & n;
		    System.out.println(newNumber); 
		}
	}
}
