#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,c,num;
  cin>>r>>c>>num;
  if(num<=c||(num%c==1)||(num%c==0))
    cout<<"Yes";
  else
    cout<<"No";
}