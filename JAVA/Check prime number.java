public class Main{
	public static void main(String[] args) {
	    int num = 97;
	    boolean flag= false;
	    
	    for(int i=2;i <= num/2;i++){
	        // condition for non prime
	        if(num % i == 0){
	            flag=true;
	            break;
	        }
	    }
	    
	    if(flag==false){
	        System.out.println(num + " is a prime number. ");
	    }
	    else{
	        System.out.println(num + " is not a prime number. ");
	    }
	 }
}
