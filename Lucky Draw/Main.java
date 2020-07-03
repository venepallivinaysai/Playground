#include<iostream>
using namespace std;
int main(){
  int n,i,c=0;
  cin>>n;
  for(i=1;i<=n;i++){
    if(n%i==0){
      c=c+1;
    }
  }
  
  if(c!=2)
    cout<<"Not eligible";
  else
    cout<<"Eligible";
}
    