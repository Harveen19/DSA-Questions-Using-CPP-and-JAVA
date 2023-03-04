public class Main
{
    public static int isprime(int n){

      for(int i = 2; i<=Math.sqrt(n); i++){
        if(n%i==0)
          return 0;
      }

      return 1;
   }

   public static void primeFactors(int n)
   {

      for(int i = 2; i<= n; i++){
          if(isprime(i)==1){
             int x = n;
             while(x%i==0){
                System.out.print(i + " ");
                x /= i;
             }
          }
       }

   }
   
	public static void main(String[] args) {
	    int n=12;
		primeFactors(n);
	}
}

//Method  :
//Create a function say isprime(int n), that will return 1 if a number is prime, otherwise return 0.
//primeFactors(int n), will print the prime factors of the number.
//Run a loop from 2 to n,
//Check if it is prime, then
//Create a variable x to hold n,
//Run a while loop that will terminate when ( x is not divisible by i)
//Inside that loop print i and decrement as, x = x/2
