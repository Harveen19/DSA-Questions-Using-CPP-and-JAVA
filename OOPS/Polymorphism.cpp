#include"bits/stdc++.h";
using namespace std;

// function overloading

class harveen{
    public:
    void func(){
        cout <<"I am a function with no arguments" <<endl;
    }

    void func(int x){
        cout<<"I am a function with int argument"<<endl;
    }

    void func(double x){
        cout <<"I am a function with double argument"<<endl;
    }
};

int main(){
    harveen obj;
    obj.func();
    obj.func(4);
    obj.func(6.2); 
}