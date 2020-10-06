#include<iostream>
using namespace std;

int main()
{
  //Type your code here.
  cout<<"Enter the number of elements in the array"<<"\n";
  int n;
  cin>>n;
  int a[n];
  cout<<"Enter the elements in the array"<<"\n";
  int i;
  for(i=0;i<n;i++)
  {
    cin>>a[i];
  }
  int result;
  int res,e=0,o=0;
  for(int i=0;i<n;i++)
  {
    if(a[i]%2==0)
      e++;
    else
      o++;
  }
  if(e==(n))
    result=1;
  else if(o==(n))
    result=2;
  else
    result=3;
  if(result==1)
    cout<<"The array is Even";
  else if(result==2)
    cout<<"The array is Odd";
  else
    cout<<"The array is Mixed";
  
}
