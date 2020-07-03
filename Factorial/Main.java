#include<iostream>
using namespace std;
int fact(int);
int main()
{
  int n;
  cin>>n;
  int d=fact(n);
  cout<<"The factorial of "<<n<<" is "<<d;
}
int fact(int x){
  int val;
  if(x>0){
    val=x*fact(x-1);
  }
  else{
  return 1;
  }
}
    
