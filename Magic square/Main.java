#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,c,i,j;
  cin>>r;
  c=r;
  int a[r][c];
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      cin>>a[i][j];
    }
  }
  int s1=0,s2=0;
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      if(i==j)
        s1=s1+a[i][j];
      if((i+j)==(r-1))
        s2=s2+a[i][j];
    }
  }
    if(s1==s2)
      cout<<"Yes";
  else 
    cout<<"No";
}
  