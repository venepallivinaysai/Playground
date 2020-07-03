#include<iostream>
using namespace std;
int fib(int);
int main()
{
  int n,d;
  cin>>n;
  d=fib(n);
  cout<<"The term "<<n<<" in the fibonacci series is "<<d;
}
int fib(int x){
  int val;
  if(x==1)
    return 0;
  else if(x==2)
    return 1;
  else{
    val=(fib(x-1)+fib(x-2));
  }
}