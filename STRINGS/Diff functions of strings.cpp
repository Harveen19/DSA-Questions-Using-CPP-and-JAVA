
// Declaring a string
#include<iostream>
#include<string>
using namespace std;

int main(){
     string str= "Rishab";
     // It declares a string of value “rishabh”

     string str(10);
     // It declares a string of size 10

     string s(5, 'N');
     //It declares a string of size 5 with all characters ‘N’

     string abc(str);
     //It declares a copy of the string str
}

// Taking Input

#include<iostream>
#include<string>
using namespace std;

int main(){
    string str= "Rishab";
     // It declares a string of value “rishabh”

     string abc(str);
     //It declares a copy of the string str
     
     string s;
     getline(cin,s);
     
     cout<<"Rishab is "<<s <<endl;
     // input= a peaceful soul
     // output= Rishab is a peaceful soul
}

// Different functions of string
// 1. append()
#include<iostream>
#include<string>
using namespace std;

int main(){
    string s1= "fam", s2= "ily";
    // s1.append(s2);
    s1 = s1+s2;
    cout<< s1<< endl;
}
// 2. assign()
#include<iostream>
#include<string>
using namespace std;

int main(){
    string s= "nincompoop";
    s.assign("Rishab");
    cout<< s <<endl;
}
// 3. at()
#include<iostream>
#include<string>
using namespace std;

int main(){
    string s="rahul";
    cout<< s.at(3)<<endl;
    cout<< s[2]<<endl;
}
// 4. begin()
#include<iostream>
#include<string>
using namespace std;

int main(){
     string s="rahul";
    
     s.begin();
     cout<<s[1]<<endl;
}
// 5. clear()
#include<iostream>
#include<string>
using namespace std;

int main(){
     string s="rahul";
    
     s.clear();
     cout<<s<<endl;
}
// 6. compare()
#include<iostream>
#include<string>
using namespace std;

int main(){
     string s1="abc";
     string s2="xyz";
     cout<<s2.compare(s1)<<endl;
     return 0;
     // Output: 1513239 - basically a value greater than 0 denoting s2 is greater than s1.
     // IF both strings will be same then output=0.
     
     string s1="xyz";
     string s2="abc";
     cout<<s2.compare(s1)<<endl;
     return 0;
     // Output: -1513239 - basically a value less than 0 denoting s2 is less than s1.
}
