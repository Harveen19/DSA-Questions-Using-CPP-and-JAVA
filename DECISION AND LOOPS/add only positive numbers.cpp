#include<iostream>
using namespace std;

int main(){
    int number;
    int sum=0;

    cout<<"Enter a number: ";

    cin>>number;

    while(number>=0){
        sum += number;
    }
    cout<<"The sum is: " <<sum <<endl;
}