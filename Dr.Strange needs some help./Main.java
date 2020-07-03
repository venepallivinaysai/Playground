#include<iostream>
#include<cmath>
using namespace std;
int power(int,int);
int main(){
  int a,b,c;
  cin>>a>>b>>c;
  if(c<=power(a,b))
    cout<<"Doctor, you can proceed with your experiment.";
  else
    cout<<"Sorry Doctor! You need more bacteria.";
}
int power(int x,int y){
  int value;
  value=pow(x,y);
  return value;
}