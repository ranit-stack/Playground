#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,c,i,j,s1=0,s2=0,max=0,res;
  cin>>r>>c;
  int a[r][c];
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      cin>>a[i][j];
    }
  }
  cout<<"Sum of rows is ";
  for(i=0;i<r;i++)
  {
    s1=0;
    for(j=0;j<c;j++)
    {
      s1=s1+a[i][j];
    }
    cout<<s1<<" ";
   
    
    if(max<s1){
      max=s1;
      res=i;
    }
    
  
}
  cout<<"\n";
  cout<<"Row "<<res+1<<" has maximum sum"<<"\n";
   cout<<"Sum of columns is ";
  max=0;
  for(i=0;i<c;i++)
  {
    s1=0;
    for(j=0;j<r;j++)
    {
      s1=s1+a[j][i];
    }
    cout<<s1<<" ";
   
    
    if(max<s1){
      max=s1;
      res=i;
    }
    
  
}
  cout<<"\n";
  cout<<"Column "<<res+1<<" has maximum sum"<<"\n";
}