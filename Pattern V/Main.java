#include <iostream> 
using namespace std; 
int main() { 
    int n,s,i,j,l,r ;
  cin>>n;
    l= 1;  
    r=n*n+1;
    for(i=n;i>0;i--){ 
        for(s=n;s>i;s--) 
            cout<<"--";   
        for(j=1;j<=i;j++){ 
            cout<<l; 
            cout<<"*"; 
            l++; 
        } 
        for(j=1;j<=i;j++){ 
            cout<<r; 
            if(j<i) 
                cout<<"*"; 
            r++; 
        } 
        r=r-(i-1)*2-1; 
        cout<<endl;
    } 
} 
