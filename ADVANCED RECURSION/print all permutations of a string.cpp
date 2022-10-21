#include<iostream>
using namespace std;

void permutation(string s, string ans){
    if(s.length()==0){ // base case
        cout<<ans<<endl;
        return;
    }
    for(int i=0;i<s.length();i++){
        char ch= s[i]; // Here fixed character is stored
        string restofString= s.substr(0,i) + s.substr(i+1); // 0 and i+1 is used for starting point of string and i denotes here length.

        permutation(restofString, ans+ch); // ans+ch for fixed character and this is call again and again after every character

    }

}

int main(){

    permutation("ABC", "");
    return 0;
}