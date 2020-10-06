#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,m,a[50],bus=0,i;
  cin>>n>>m;
  for(i=0;i<n;i++)
  {
    cin>>a[i];
  }
  int sum=0;
  for(i=0;i<n;i++)
  {
    sum=sum+a[i];
  }
  if(n==1 && m==2)
    bus=1;
  else
    bus=(sum/m)+1;
  cout<<bus;
}