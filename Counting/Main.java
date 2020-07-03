#include<iostream>
using namespace std;
int main()
{
  string a;
  getline(cin,a);
  int v=0,c=0,w=0,d=0,s=0;
  for(int i=0;i<a.length();i++){
    if(65<=int(a[i])&&int(a[i])<=90||97<=int(a[i])&&int(a[i])<=122){
      if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u'||a[i]=='A'||a[i]=='E'||a[i]=='I'||a[i]=='O'||a[i]=='U')
        v=v+1;
      else
        c=c+1;
    }
    else if(a[i]==' ')
      w=w+1;
    else if(48<=int(a[i])&&int(a[i])<=57)
      d=d+1;
    else
      s=s+1;
  }
  cout<<"Vowels:"<<v;
  cout<<"\nConsonants:"<<c;
  cout<<"\nWhite Spaces:"<<w;
  cout<<"\nDigits:"<<d;
  cout<<"\nSymbols:"<<s;
  
}