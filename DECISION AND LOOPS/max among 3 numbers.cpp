#include<iostream>
using namespace std;

int main(){
    int n1,n2,n3;
    cin>>n1>>n2>>n3;

    int max;

    if(n1>n2 && n1>n3){
        max=n1;
    }
    else if(n2>n1 && n2>n3){
        max=n2;
    }
    else{
        max=n3;
    }
    cout<<"Max ="<<max<<endl;

    return 0;
}