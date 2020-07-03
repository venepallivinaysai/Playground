#include<iostream>
using namespace std;
int main(){
   int n,c=0;
   float s=0;
   do{
     cin>>n;
     if(n<0){
       s=s-1.0;
       break;
      }
     else if(n%2!=0){
       c=c+1;
       s=s+1;
     }
     else{
      s=s-0.5;
    }   
  }while(n>0&&c!=3);
  cout<<s;
}