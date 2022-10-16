// 1st METHOD

#include <iostream>
#include<climits>
using namespace std;

bool pairSum(int arr[], int n, int k){
    for(int i=0; i<n-1; i++){
        for(int j=i+1; j<n; j++){
            if(arr[i]+arr[j]==k){
                cout<<i<<" "<<j<<endl;
                return true;
            }
        }
    }
    return false;
}
int main(){
    int arr[]={2,4,7,11,18,21};
    int k=25;
    
    cout<<pairSum(arr,6,k)<<endl;
    return 0;
}


// 2nd METHOD

#include <iostream>
#include<climits>
using namespace std;

bool pairSum(int arr[], int n, int k){
    int low=0;
    int high=n-1;
    
    while(low<high){
        if(arr[low]+arr[high]==k){
            cout<<low<<" "<<high<<endl;
            return true;
        }
        else if(arr[low]+arr[high]>k){
            high--;
        }
        else{
            low++;
        }
    }
    return false;
}
int main(){
    int arr[]={2,4,7,11,18,21};
    int k=25;
    
    cout<<pairSum(arr,6,k)<<endl;
    return 0;
}
