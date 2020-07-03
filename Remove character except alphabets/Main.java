#include<iostream>
using namespace std;
int main()
{
  string a,b;
  getline(cin,a);
  for(int i=0;i<a.length();i++){
    if(65<=int(a[i])&&int(a[i])<=90||97<=int(a[i])&&int(a[i])<=122)
      cout<<a[i];
  }
  
}