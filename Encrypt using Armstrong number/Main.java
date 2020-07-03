#include<iostream>
#include<cmath>
using namespace std;
int power(int);
int main(){
  int n,m,c=0;
  cin>>n;
  m=power(n);
  if(m==n)
    cout<<"Kindly proceed with encrypting";
  else
    cout<<"It is not an Armstrong number";
}
int power(int x){
  int m=x,c=0,val=0,t;
    while(x>0){
      x=x/10;
      c=c+1;
  }
    while(m>0){
      t=m%10;
      val=val+pow(t,c);
      m=m/10;
  }
  return val;
}
