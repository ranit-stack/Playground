#include <iostream>
using namespace std;
int pattern(int n)
{
   //Your code goes here
  int i,j,k;
  for(i=1;i<=n;i++)
  {
    if((i==1)||(i==n))
    {
      for(k=1;k<=n;k++)
      {
        cout<<"1";
      }
    }
    else
      for(k=1;k<=n;k++)
      {
        if((k==1)||(k==n))
        {
          cout<<"1";
        }
        else
          cout<<" ";
      }
    cout<<"\n";
  }
}
int main()
{
    int n;
    cin>>n;
    pattern(n);
}
