#include <cstring>
#include <iostream>
#include<string>
using namespace std;
int main()
{
   //Your code goes here
  string in;
  getline(cin,in);
  int s=0;
  int i;
  
  for(i=0;i<in.length();i++)
  {
    if(in[i]==' ')
      s++;
  }
  
  if(s<10)
    cout<<"Caption eligible for the contest";
  else
    cout<<"Caption not eligible for the contest";
   
}