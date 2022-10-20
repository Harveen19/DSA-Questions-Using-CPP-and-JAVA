#include<iostream>
using namespace std;

void Reverse(string s){

    // base case
    if(s.length()==0){
        return;
    }

    // recursive case
    // we are taking out the string except 1st character.
    
    string restString = s.substr(1); // substr is a STL function
    // here except 1st character the whole string will be stored in restString

    Reverse(restString);
    cout<< s[0];
    // 1st we are calling the function then we are printing first character. 
}

int main(){
    Reverse("Gurveen");
}