#include<iostream>
using namespace std;

class printThevalues
{
    string name;
    public:
    
    int age;
    bool gender;
    
    // to access privata data members anywhere outside the class
    void setName(string s){ // setter function
        name=s;
    }
    
    void getName(){ // get function
        cout<<name<<endl;
    }
    
    void printInfo(){
        cout<<"Name = ";
        cout<<name<<endl;
        cout<<"Age = ";
        cout<<age<<endl;
        cout<<"Gender = ";
        cout<<gender<<endl;
    }
};

int main(){
    printThevalues arr[3];
    for(int i=0;i<3;i++){
        string s;
        
        cout<<"Name = ";
        cin>>s;
        arr[i].setName(s);
        cout<<"Age = ";
        cin>>arr[i].age;
        cout<<"Gender =";
        cin>>arr[i].gender;
    }
    for(int i=0;i<3;i++){
        arr[i].printInfo();
    }
    return 0;
}