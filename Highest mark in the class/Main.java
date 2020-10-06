#include<iostream>
int main()
{
  // Type your code here
  int n;
  std::cin>>n;
  int arr[n];
  int i;
  for(i=0;i<n;i++)
  {
    std::cin>>arr[i];
  }
  int max=arr[0];
  for(i=1;i<n;i++)
  {
    if(arr[i]>max)
      max=arr[i];
  }
  std::cout<<max;
}