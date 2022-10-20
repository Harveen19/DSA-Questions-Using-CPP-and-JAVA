#include<iostream>
using namespace std;

void subseq(string s, string ans){ // ans for printing substrings

    if(s.length()==0){ // base case because after every recursive call length is becoming small
        cout<< ans <<endl;
        return;
    }
    char ch= s[0]; // removing 1st character and find rest string
    string restofS= s.substr(1);

    subseq(restofS, ans); // here we'll not add character
    subseq(restofS, ans+ch); // here we'll add character
}

int main(){
    subseq("ABC","");
    return 0;
}