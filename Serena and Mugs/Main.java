#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int m[50],n,s;
  cin>>n>>s;
  int i;
  for(i=0;i<n;i++)
  {
    cin>>m[i];
  }
  int sum=0;
  for(i=0;i<n;i++)
  {
    sum=sum+m[i];
  }
  if(sum<=s)
    cout<<"YES";
  else 
    cout<<"NO";
}