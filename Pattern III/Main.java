#include<iostream>
using namespace std;
int main(){
  int n,i,j,s,k=0;
  cin>>n;
  s=n;
  for(i=1;i<=n;i++){
        for(j=1;j<=i;j++){
          if(j==i)
            cout<<i;
          else{
            cout<<i;
              cout<<"*";
          }
        }
        s++;
       cout<<"\n";
    }
    s--;
    for(i=n;i>=1;i--){
        for(j=1;j<=i;j++){
        if(j==i)
            cout<<i;
          else{
            cout<<i;
              cout<<"*";
          }

        }
      s--;
      cout<<"\n";
    }
}