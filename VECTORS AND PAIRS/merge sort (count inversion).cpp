#include <iostream>
using namespace std;

long long merge(int arr[], int l, int mid, int r){
    long long inv = 0;
    int n1 = mid-l+1; // for left half
    int n2 = r - mid; // for right half
    
    // stored in temporary arrays
    int a[n1];
    int b[n2];
    
    for(int i=0;i<n1;i++){
        a[i] = arr[l+i];
    }
    for(int i=0;i<n2;i++){
        b[i] = arr[mid+i+1];
    }
    int i=0, j=0, k=l;
    // i for left array and j for right array
    while(i<n1 and j<n2){
        if(a[i] <= b[j]){ // then no inversion
            arr[k] = a[i];
            k++;i++;
        }
        else{
            arr[k] = b[j];
            // here inversion occurs so for counting them we have done n1-i
            // a[i],a[i+1],a[i+2]...a[] > b[j] and i < j
            inv += n1 - i;
            k++;j++;
        }
    }
    //  for remaining elements
    while(i<n1){
        arr[k] = a[i];
        k++;
        i++;
    }
    while(j<n2){
        arr[k] = b[j];
        k++;
        j++;
    }
    return inv;
}

long long mergeSort(int arr[], int l, int r){
    long long inv=0;
    if(l < r){
        // divide the sorted array into 2 parts
        int mid = (l+r)/2;
        inv += mergeSort(arr,l,mid); // inversions of left side
        inv += mergeSort(arr,mid+1,r); // inversions of right side
        
        // now merge sorted arrays including inversions
        inv += merge(arr,l,mid,r);
        
    }
    return inv;
}

int main()
{
    int n;
    cin>>n;
    
    int arr[n];
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }
    cout<<mergeSort(arr,0,n-1);
    return 0;
}
