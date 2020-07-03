#include<iostream>
using namespace std;
int main(){
  int a,b,i,n,sum;
  cin>>a>>b;
  for(i=a;i<=b;i++){
    sum=0;
    n=1;
    while(n<i){
      if(i%n==0)
           sum=sum+n;
      n++;
    }
    if(sum==i)
       cout<<n<<" ";
  }
}
 
