#include <iostream>
using namespace std;
struct Dis{
    int i;
    float f;
}d1,d2;
int main()
{
  cin >> d1.i;
  cin >> d1.f;
  cin >> d2.i;
  cin >> d2.f;
  int in;
  float fe;
  in = d1.i+d2.i;
  fe = d1.f+d2.f;
  if(fe > 12){
    ++ in;
    fe-= 12;
  } 
  cout << in <<"'-"<< fe<<"\"" ;
}