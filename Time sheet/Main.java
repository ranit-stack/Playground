#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a[7];
  int s=0,h=0;
  int i;
  for(i=0;i<7;i++)
  {
    cin>>a[i];
  }
  for(i=1;i<=5;i++)
  {
    if(a[i]<=8)
      s=s+(a[i]*100);
    else
      s=s+(a[i]*100)+((a[i]-8)*15);
  }
  for(i=1;i<=5;i++)
  {
    h=h+a[i];
  }
  if(h>40)
  s=s+(h-40)*25;
  else
  {
    s=s+(a[6]*100)+(a[6]*100*0.25);
    s=s+(a[0]*100)+(a[0]*100*0.50);
  }
  cout<<s;
  
  
}