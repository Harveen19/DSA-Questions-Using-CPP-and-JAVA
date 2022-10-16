#include<iostream>
using namespace std;

int Firstocc(int arr[], int n, int key, int i){
    if(i==n){
        return -1;
    }

    if(arr[i]==key){
        return i;
    }

    return Firstocc(arr,n,key,i+1);
}

int Lastocc(int arr[], int n, int key, int i){
    if(i==n){
        return -1;
    }
    
    int restArray= Lastocc(arr,n,key,i+1);
    if(restArray != -1){
        return restArray;
    }

    if(arr[i]==key){
        return i;
    }
    return -1;
}

int main(){

    int arr[]= {4,2,1,4,5};
    cout<<Firstocc(arr,5,4,0)<<endl;
    cout<<Lastocc(arr,5,4,0)<<endl;
    return 0;
}