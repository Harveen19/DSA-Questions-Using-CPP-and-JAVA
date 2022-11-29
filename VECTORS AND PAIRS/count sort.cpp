// In this we'll find the count of every distinct element in the array
// And calculate the position of each element in sorted array

#include<iostream>
using namespace std;

void countSort(int arr[], int n){
    int k= arr[0]; // to find max element
    for(int i=0;i<n;i++){ // it will tell us in our count array how much elements are there 
        k= max(k,arr[i]);
    }
    
    int count[10]={0};
    
    // for storing count of every element from our original array
    for(int i=0;i<n;i++){
        count[arr[i]]++;
    }
    
    for(int i=1;i<=k;i++){ // to modify count array
        count[i] += count[i-1];
    }
    
    int output[n]; // array to store the values after sorting
    for(int i=n-1; i>=0 ;i--){ // to traverse array from last
        output[--count[arr[i]]] = arr[i]; // first we'll decrement and then store the value on that index  
    }
    
    for(int i=0;i<n;i++){ //  to put our output array to original array
        arr[i]=output[i];
    }
}

int main(){
    //int arr[]= {1,3,2,3,4,1,6,4,3};
    //countSort(arr,9);
    
    //for(int i=0;i<9;i++){
       // cout<<arr[i]<<" ";
    
    int n;
    cin>>n;
    
    int arr[n];
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }
    
    countSort(arr,n);
    for(int i=0;i<n;i++){
        cout<<arr[i]<<" ";
    }
    return 0;
}