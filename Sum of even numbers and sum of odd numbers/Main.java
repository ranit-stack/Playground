#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a[15],i,sum1=0,sum2=0,n;
  cin>>n;
  for(i=0;i<n;i++)
  {
    cin>>a[i];
    if(a[i]%2==0)
      sum1=sum1+a[i];
    else
      sum2=sum2+a[i];
  }
  cout<<"The sum of the even numbers in the array is "<<sum1<<"\n"<<"The sum of the odd numbers in the array is "<<sum2;
  
}