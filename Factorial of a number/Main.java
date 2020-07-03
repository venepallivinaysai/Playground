#include<iostream>
using namespace std;
int main(){
  int n,i,x=1;
  cin>>n;
  for(i=n;i>0;i--){
    x=x*i;
  }
  cout<<x;
}