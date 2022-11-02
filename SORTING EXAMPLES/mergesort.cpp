#include<iostream>
using namespace std;

void merge(int arr[], int a, int mid, int b){
// In this array we are having two small sorted arrays i.e a to mid and mid to b.
// To merge them we have made two temporary arrays and stored the values.

    int n1= mid-a+1;
    int n2= b-mid;

    int a1[n1];
    int b1[n2]; // temporary arrays

    for(int i=0; i<n1; i++){
        a1[i]= arr[a+i]; // because starting point of array is a.
    }

    for(int i=0; i<n2; i++){
        b1[i]= arr[mid+1+i];
    }

    // So, to get sorted merge array we have to first make the pointers.
    int i=0;
    int j=0;
    int k=a; // To traverse the main array and will initialize it will a. 

    while(i<n1 && j<n2){ // here i is traversing array n1 and j traversing array n2.
        if(a1[i]<b1[j]){
            arr[k]= a1[i]; // here we'll first fill the small value
            k++;
            i++;
        }
        else{
            arr[k]= b1[j];
            k++;
            j++;
        }
    }

    while (i<n1) // we'll come to this loop if i will not reach at last.
    {
        /* code */
        arr[k]= a1[i];
        k++;
        i++;
    }
    
    while (j<n2) // same happens with  second array
    {
        /* code */
        arr[k]=b1[j];
        k++;
        j++;
    }
    
}

void mergeSort(int arr[], int a, int b){
    
    if(a<b){

        int mid= (a+b)/2;
        mergeSort(arr,a,mid);
        mergeSort(arr,mid+1,b);
// Here a,b and mid these pointers are telling us till where we have to sort our array.
        
        merge(arr,a,mid,b);
    }
}

int main(){

    int arr[]= {5,4,3,2,1};
    mergeSort(arr,0,4);

    for(int i=0; i<5; i++){ // To print array
        cout<<arr[i] <<" ";
    }
    cout<<endl;
    return 0;
}