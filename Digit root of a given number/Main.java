#include<iostream>
using namespace std;
int digit(int);
int main()
{
  int n;
  cin>>n;

  int res=digit(n);

    cout<<digit(res);
  }

int digit(int n)
{
  int d,sum=0;
  while(n!=0)
  {
    d=n%10;
    sum=sum+d;
    n=n/10;
  }
  if(sum<10)
    return(sum);
  else
    digit(sum);
}
