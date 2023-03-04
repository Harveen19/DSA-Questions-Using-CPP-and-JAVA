import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
	    int a= sc.nextInt();
	    int b= sc.nextInt();
	    
	    int gcd=1;
	    for(int i=1; i<=a && i<=b; i++){
	        if(a%i==0 && b%i==0){
	            gcd=i;
	        }
	    }
		System.out.println("GCD of " + a +" " + "and"+" " + b +" " + "is" +" "+ gcd);
	}
}


//Here, two numbers whose GCD are to be found are stored in a and b respectively.
//Then, a for loop is executed until i is less than both a and b. This way, all numbers between 1 and smallest of the two numbers are iterated to find the GCD.
//If both a and b are divisble by i, gcd is set to the number. This goes on until it finds the largest number (GCD) which divides both n1 and n2 without remainder.
