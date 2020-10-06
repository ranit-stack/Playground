#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int m,n;
  cin>>m>>n;
  int a[m][n];
  int i,j;
  for(i=0;i<m;i++)
  {
    for(j=0;j<n;j++)
    {
      cin>>a[i][j];
    }
  }
  int m1=0,m2=0;
  for(i=0;i<n;i++)
      {
    m1=a[0][i];
    for(j=1;j<m;j++)
    {
      if(a[j][i]>m1)
        m1=a[j][i];
    }
    cout<<m1<<"\n";
  }
  
     
        
}