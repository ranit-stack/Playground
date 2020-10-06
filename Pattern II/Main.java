#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int i,j,k,x=0,y=0,z=0;
  for(i=1;i<=n;i++)
  {
    if(i%2==0)
    {
      x=i+y;
      for(j=1;j<=i;j++)
      {
          if(j>1)
          {



        cout<<"*"<<x;
        x--;
      }
      else
      {
          cout<<x;
          x--;
      }

    }
    }
    else
    {
      z=x+i;
      for(k=1;k<=i;k++)
      {
          if(k>1)
          {


        cout<<"*"<<z;
        y=z;
        z++;
      }
      else{
        cout<<z;
        y=z;
        z++;
      }


    }
    }
    cout<<"\n";
  }
}
