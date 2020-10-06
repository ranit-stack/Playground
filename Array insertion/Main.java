#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
 while(1)
 {
   int n,a[20],pos,val,i;
  cout<<"Enter the number of elements in the array"<<"\n";
  cout<<"Enter the elements in the array"<<"\n";
  cout<<"Enter the location where you wish to insert an element"<<"\n";
  
 
  cin>>n;
  for(i=0;i<n;i++)
  {
    cin>>a[i];
  }
  cin>>pos;
  if(pos>n)
  {
    cout<<"Invalid Input"<<"\n";
    break;
  }
  cout<<"Enter the value to insert"<<"\n";
  cin>>val;
  int temp;
  for(i=n;i>=pos;i--)
  {
    a[i]=a[i-1];
  }
  a[pos-1]=val;
   cout<<"Array after insertion is"<<"\n";
  for(i=0;i<=n;i++)
  {
    cout<<a[i]<<"\n";
  }
   break;
}
}