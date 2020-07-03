#include<iostream>
using namespace std;
int di(int);
int main(){
  int n,m;
  cin>>n;
  m=di(n);
  cout<<m;
}
int di(int x){
  int sum,s;
  if(x>9){
    sum=x%10+di(x/10);
    if(sum>9){
      s=sum%10+di(sum/10);
    }
  }
}