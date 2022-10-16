#include<iostream>
using namespace std;

int main(){
    int a,b;
    cout<<"Enter 2 numbers: ";

    cin>>a>>b;
    int n;
    int i;

    for(n=a; n<=b; n++){
        for(i=2;i<n;i++){
            if(n%i==0){
                break;
            }
        }
    if(i==n){
        cout<<n<<endl;
        }
    }
    return 0;

}