import java.util.*;

public class Main {
	public static void main(String[] args) {
	    char last = 'G' , alphabet = 'A';
	    for(int i=1; i<= (last - 'A' + 1); i++){
	        for(int j=1; j<=i; j++){
	            System.out.print(alphabet + " ");
	        }
	        alphabet ++;
	        System.out.println(" ");
	    }
	}
}
