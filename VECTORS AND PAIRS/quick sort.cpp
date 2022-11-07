#include<iostream>
using namespace std;

void swap(int arr[], int i, int j){
    int temp= arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
}

int partition(int arr[], int a, int b){

    int pivot= arr[b];
    int i= a-1;

    for(int j=a; j<b; j++){
        if(arr[j]<pivot){
            i++;
            swap(arr,i,j);
        }
    }
    swap(arr,i+1,b);
    return i+1;
}
void quickSort(int arr[], int a, int b){

    if(a<b){
        int pi= partition(arr,a,b); // here we'll get index of pivot element
        quickSort(arr,a,pi-1);
        quickSort(arr,pi+1,b);
    }
}
int main(){

    int arr[4]= {5,4,3,2};
    quickSort(arr,0,3);

    for(int i=0;i<5;i++){
        cout<<arr[i] <<" ";
    } 
    cout<<endl;
    return 0;
}