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

// operator overloading

#include"bits/stdc++.h"
using namespace std;

class Complex{
    private:
    int real, imag;
    public:
    // creating constructor for class 
    Complex(int r=0, int i=0){
        real=r;
        imag=i;
    }

    Complex operator + (Complex const &obj){
        Complex res;
        res.imag = imag + obj.imag;
        res.real = real + obj.real;
        return res;
    }

    // memeber function for print
    void display(){
        cout<< real << " + i"<< imag <<endl;
    }
};

int main(){
    Complex c1(12,7), c2(6,7);
    Complex c3 = c1+c2;
    c3.display();
    return 0;
}

// Run time Polymorphism
// make one base class and derived class

#include"bits/stdc++.h"
using namespace std;

// base class
class base{
    public:
    virtual void print(){
        cout << "this is base class"<<endl;
    }
    void display(){
        cout << "this is base class display"<<endl;
    }
};

// derived class
class derived: public base{
    public:
    void print(){
        cout << "this is derived class"<<endl;
    }
    void display(){
        cout << "this is derived class display"<<endl;
    }
};

int main(){
    // base pointer
    base *baseptr;
    // object of derived class
    derived d;
    // in pointer of base we'll put address of derived class
    baseptr= &d;

    baseptr -> print();
    baseptr -> display();
    return 0;
}