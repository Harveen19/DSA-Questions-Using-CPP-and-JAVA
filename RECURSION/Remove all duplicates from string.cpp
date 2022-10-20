#include<iostream>
using namespace std;

string dups(string s){
    if(s.length()==0){ // base case
        return ""; // it will give us empty string
    }
    char ch= s[0]; // Storing 1st character
    string ans = dups(s.substr(1)); // function call of rest of the string and will remove the duplicates.

    if(ch==ans[0]){
        return ans;
    }
    return (ch+ans); // here we will not get duplicate so we'll include the ans.
}

int main(){
    cout<< dups("aaabbbbccd")<<endl;
    return 0;
}