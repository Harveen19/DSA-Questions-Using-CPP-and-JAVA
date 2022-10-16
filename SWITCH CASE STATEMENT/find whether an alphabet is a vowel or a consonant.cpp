#include<iostream>
using namespace std;

int main(){
    char b;
    cout<<"Enter an alphabet: ";

    cin>>b;

    switch(b){
        case 'a':
        cout<<"Vowel"<<endl;
        break;

        case 'e':
        cout<<"Vowel"<<endl;
        break;

        case 'i':
        cout<<"Vowel"<<endl;
        break;

        case 'o':
        cout<<"Vowel"<<endl;
        break;

        case 'u':
        cout<<"Vowel"<<endl;
        break;

        default:
        cout<<"Its a consonant. "<<endl;
    }

    return 0;
    
}