#include<iostream>
using namespace std;

int main(){
    int n;
    cin>>n;

    int sum=0; int orig_num=n;
    while(n>0){
        int rem= n%10;
        sum= sum+rem * rem * rem;
        n=n/10;
    }
    if(orig_num==sum){
        cout<<"Armstrong number"<<endl;
    }
    else{
        cout<<"Not an Armstrong number"<<endl;
    }

    return 0;
}