#include<iostream>
using namespace std;

void swap(int arr[], int i, int j){ // for swaping
    int counter= arr[i];
    arr[i]=arr[j];
    arr[j]=counter;
}

void dnfSort(int arr[], int n){
    int low=0, mid=0, high=n-1;
    
    // while loop because we're not putting our mid forward everytime
    while(mid<=high){ // when we'll do this our array we'll be sorted
       if(arr[mid]==0){
           swap(arr,low,mid);
           low++;
           mid++;
       }
       else if(arr[mid]==1){
           mid++;
       }
       else{
           swap(arr,mid,high);
           high--;
       }
    }
}

int main(){
    //int arr[]= {1,0,2,1,0,1,2,1,2};
    //dnfSort(arr,9);
    
    //for(int i=0;i<9;i++){
       // cout<<arr[i]<<" ";
    
    int n;
    cin>>n;
     
    int arr[n];
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }
    
    dnfSort(arr,n);
    for(int i=0;i<n;i++){
        cout<<arr[i]<<" ";
    }
    return 0;
}