#include<iostream>
using namespace std;
int main(){
  int n,a,i,x;
  cin>>n;
  a=11;
  cout<<a*a<<" ";
  for(i=2;i<=n;i++){
    x=(a+(4*(i-1)))*(a+(4*(i-1)));
    cout<<x<<" ";
  }
}
      
     