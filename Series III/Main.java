#include<iostream>
using namespace std;
int main(){
  int n,a,i;
  cin>>n;
  a=6;
  for(i=1;i<=n;i++){
    a=a+(5*(i-1));
    cout<<a<<" ";
  }
}
