#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  string s;
  cin>>s;
  int n;
  cin>>n;
  if(s=="front")
  {
    if(n==1)
      cout<<"Left Handed";
    else 
      cout<<"Right Handed";
  }
  else
  {
   if(n==1)
      cout<<"Right Handed";
    else 
      cout<<"Left Handed"; 
}
}