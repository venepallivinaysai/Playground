#include<iostream>
#include<string>
int main() 
{ 
	std::string fnum,str;
  std::getline(std::cin,fnum);
	int p,i=0;
  p=fnum.find(".");
  std::cout<<"Floating part is : ";
  if(p<fnum.length()){
    for (i=p+1;i<fnum.length();i++)
    std::cout<<fnum[i];
  }
}