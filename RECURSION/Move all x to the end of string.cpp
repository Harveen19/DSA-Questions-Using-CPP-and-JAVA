#include<iostream>
using namespace std;

string moveX(string s){
    if(s.length()==0){ // base case
        return "";
    }
    // Recursive case
    char ch= s[0]; // 1st we will take out the character then we'll call the function for rest of the string.
   string ans= moveX(s.substr(1));

   if(ch=='x'){
    return ans+ch; // to add x at last
   }
   return ch+ans; // Then here character will be at the starting only
}

int main(){
    cout<< moveX("axxbdxciexok") <<endl;
    return 0;
}