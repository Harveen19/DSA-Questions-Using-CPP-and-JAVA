#include<iostream>
#include<vector>

using namespace std;

bool myCompare(pair<int, int> p1, pair<int, int> p2){
    // To check whether p1 or p2 will come first 
    // By using their first element
    return p1.first<p2.first;
}

int main(){
    int arr[]= {10,16,4,15,6,20};

    // we'll make vector of pairs and type will be int  
    vector < pair<int, int> > v; 
    
    // To store arrays in pairs we'll traverse the whole array
    for(int i=0; i<(sizeof(arr)/sizeof(arr[0])); i++){ // with this we'll get size of our array
        
        // now we'll make pair of every element with its index and storing it in vector.
        v.push_back(make_pair(arr[i],i)); // here first pair will be made of i and arr[i] and then will be pushed to v.
    }

    // for sorting and using compare to check how we're sorting 
    sort(v.begin(), v.end(), myCompare);
    for(int i=0; i<v.size(); i++){

        // to modify original array
        arr[v[i].second]=i;
    }
    for(int i=0; i<v.size(); i++){ // to print array
       cout<<arr[i] <<" ";
    }
    cout<<endl;
    return 0;
}
