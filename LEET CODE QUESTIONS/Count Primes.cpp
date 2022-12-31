// 204. Count Primes
//Medium
//6.2K
//1.2K
//Companies
//Given an integer n, return the number of prime numbers that are strictly less than n.

//Example 1:

//Input: n = 10
//Output: 4
//Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.

//Example 2:

//Input: n = 0
//Output: 0
//Example 3:

//Input: n = 1
//Output: 0


class Solution {
public:
        int countPrimes(int n) {
            vector<int> prime(n+1,true);
            
            for(int i=2;i<=sqrt(n);i++){
                if(prime[i]){
            for(int j = i*2; j <=n; j+=i){
                prime[j]= false;
            }
        }
    }
    int count = 0;
    for(int i=2;i<n;i++){
        if(prime[i])
            count++;
    }
    return count;
    }
};