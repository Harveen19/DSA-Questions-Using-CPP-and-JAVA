#include <iostream>
using namespace std;

int main(){

    // Largest word in a sentence

    int n;
    cin>>n;
    cin.ignore();
    
    char arr[n+1];
    
    cin.getline(arr, n);
    cin.ignore();
    
    int i=0;
    int currentLength = 0;
    int maxLength = 0;
    int st=0;
    int maxst=0;
    
    while(true){
        if(arr[i] == ' ' || arr[i] == '\0'){
            if(currentLength > maxLength){
                maxLength = currentLength;
                maxst = st;
            }
            currentLength=0;
            st=i+1;
        }
        else{
            currentLength++;
        }
        if(arr[i] == '\0'){
            break;
        }
        i++;
        
    }
    cout<< maxLength << endl;
    for(int i=0; i<maxLength; i++){
        cout<< arr[i+maxst];
    }
    return 0;
}
