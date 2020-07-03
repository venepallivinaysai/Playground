#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  string s;
  int r;
  cin>>s>>r;
  if(s=="front"){
    if(r==1)
      cout<<"Left Handed";
    else
      cout<<"Right Handed";
  }
  else if(s=="rear"){
    if(r==1)
      cout<<"Right Handed";
    else
      cout<<"Left Handed";
  }
}

