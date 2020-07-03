#include<iostream>
using namespace std;
int main()
{
  int w,a,c,x,y;
  cin>>w>>a>>c;
  x=a*75;
  y=c*30;
  if((x+y)<=w){
    cout<<"Boat is stable";
  }
  else
    cout<<"Boat will drow";
}