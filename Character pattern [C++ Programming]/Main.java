#include<iostream>
using namespace std;

void printpattern(int n)
{
	//Your code goes here
  int i,j,k;
  for(i=1;i<=n;i++)
  {
    for(j=1;j<=i;j++)
    {
      if(j%2!=0)
        cout<<"*";
      else
        cout<<"#";
    }
    cout<<"\n";
}
}


int main()
{
    int a;
    cin>>a;
    printpattern(a);
    return 0;
}
