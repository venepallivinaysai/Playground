#include <cstring>
#include <iostream>
using namespace std;
int main()
{
   string a;
  getline(cin,a);
  int s=0;
  for(int i=0;i<a.length();i++){
    if(a[i]==' ')
      s=s+1;
  }
   if(s<10)
     cout<<"Caption eligible for the contest";
  else
    cout<<"Caption not eligible for the contest";
}