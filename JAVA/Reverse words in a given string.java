/* Reverse words in a given string
Easy Accuracy: 56.08%  Submissions: 244K+  Points: 2

Given a String S, reverse the string without reversing its individual words. Words are separated by dots.

Example 1:

Input:
S = i.like.this.program.very.much
Output: much.very.program.this.like.i
Explanation: After reversing the whole
string(not individual words), the input
string becomes
much.very.program.this.like.i
Example 2:

Input:
S = pqr.mno
Output: mno.pqr
Explanation: After reversing the whole
string , the input string becomes
mno.pqr

Your Task:
You dont need to read input or print anything. Complete the function reverseWords() which takes string S as input parameter and returns a string containing the words in reversed order. Each word in the returning string should also be separated by '.' 


Expected Time Complexity: O(|S|)
Expected Auxiliary Space: O(|S|)


Constraints:
1 <= |S| <= 105
*/


class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String S)
    {
        // code here 
        char ch[] = S.toCharArray();
        String ans="";
        int a= S.length();
        
        for(int i=S.length()-1;i>=0;i--){
            if(ch[i]=='.'){
                ans += S.substring(i+1,a);
                ans=ans+'.';
                a=i;
            }
        }
        int i=0;
        if(ans.isEmpty()){
            return S;
        }
        while(ch[i] != '.'){
            ans += ch[i];
            i++;
        }
        return ans;
    }
}
