#include<iostream>
using namespace std;
struct time{
  int h,m,s;
}t1,t2;
int main()
{
  cin>>t1.h;
  cin>>t1.m;
  cin>>t1.s;
  cin>>t2.h;
  cin>>t2.m;
  cin>>t2.s;
  int x,y,z;
  if(t2.s > t1.s){
    t1.m=t1.m-1;
    t1.s+= 60;
  }
  z= t1.s- t2.s;
  if(t2.m> t1.m){
    t1.h=t1.h-1;
    t1.m+= 60;
  }
  y= t1.m-t2.m;
  x = t1.h-t2.h;
  cout<<x<<":"<<y<<":"<<z;
}