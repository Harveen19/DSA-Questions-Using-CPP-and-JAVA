#include<iostream>
using namespace std;

int main(){
    char c;
    int isLowercaseVowel, isUppercaseVowel;

    cin>>c;

    isLowercaseVowel= (c=='a' || c=='e' || c=='i' || c=='o' || c=='u');
    isUppercaseVowel= (c=='A' || c=='E' || c=='I' || c=='O' || c=='U');

    if(isLowercaseVowel || isUppercaseVowel){
        cout<<"Its a Vowel"<<endl;
    }
    else{
        cout<<"Its a Consonant"<<endl;
    }
    return 0;
}