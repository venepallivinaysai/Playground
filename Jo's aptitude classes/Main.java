#include<iostream>
using namespace std;
int gcd(int,int,int);
int main(){
  int a,b,c,d,x;
  cin>>a>>b>>c>>d;
  x=gcd(a,b,c);
  if(x==d)
    cout<<"Answer is correct.";
  else
    cout<<"Answer is wrong.";
}
int gcd(int p,int q,int r){
  int m,l,d=1;
   if(p<q&&p<r)
    l=p;
  else if (q<p&&q<r)
    l=q;
  else if(r<p&&r<q)
    l=r;
  for(m=1;m<=l;m++){
    if(p%l==0&q%l==0&&r%l==0){
      d=m;
    }
  }
  return d;
}
  
  