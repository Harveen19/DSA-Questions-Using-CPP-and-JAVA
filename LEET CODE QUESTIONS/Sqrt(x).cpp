// 69. Sqrt(x)
//Easy
//5.5K
//3.8K
//Companies
//Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.

//You must not use any built-in exponent function or operator.

//For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.
 
//Example 1:

//Input: x = 4
//Output: 2
//Explanation: The square root of 4 is 2, so we return 2.

//Example 2:

//Input: x = 8
//Output: 2
//Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.


class Solution {
public:
    int BinarySearch(int n) {
        int s=0;
        int e=n;
        long long ans= -1;
        
        while(s <= e){
            
           long long int mid= (s+e)/2;
           long long int square= mid*mid;
            
           if(square == n){
               return mid;
           }
            else if(square > n){
                e=mid-1;
            }
            else{
                s=mid+1;
                ans=mid;
            }
        }
        return ans;
    }
    int mySqrt(int x){
        return BinarySearch(x);
    }
};