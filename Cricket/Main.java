#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  float tn,c,a,b;
  int r,bb,tb,rc;
  cin>>tb>>tn>>rc>>bb;
  a=rc/((bb/6)+(0.1*(bb%6)));
  b=(tn/(tb/6));
  cout<<tb/6<<"\n";
  cout<<bb/6<<"."<<bb%6<<"\n";
  cout<<fixed << setprecision(1)<<a<<"\n";
  cout<<fixed << setprecision(1)<<b<<"\n";
  if(a>=b){
    cout<<"Eligible to Win";
  }
  else{
    cout<<"Not Eligible to Win";
  }
}