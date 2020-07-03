#include<iostream>
using namespace std;
int main(){
  int n,i,j,s;
  cin>>n;
  s=n;
  for(i=0;i<4;i++){
        for(j=0;j<=i;j++){
            cout<<s;
        }
        s++;
       cout<<"\n";
    }
    s--;
    for(i=4;i>=1;i--){
        for(j=1;j<=i;j++)
         cout<<s;
      s--;
      cout<<"\n";
    }
}