#include<iostream>
using namespace std;

int main(){
    int Sidea,Sideb,Sidec;
    cin>>Sidea>>Sideb>>Sidec;

    if(Sidea==Sideb && Sideb==Sidec){
        cout<<"Its a equilateral triangle"<<endl;
    }
    else if(Sidea==Sideb || Sidea==Sidec || Sideb==Sidec){
        cout<<"Its a isoceles triangle"<<endl;
    }
    else{
        cout<<"Its a scalene triangle"<<endl;
    }
    return 0;
}