#include<iostream>
int main()
{
  // Type your code here
  int n;
  std::cin>>n;
  int a[n];
  int i;
  for(i=0;i<n;i++)
  {
    std::cin>>a[i];
  }
  int reg;
  std::cin>>reg;
  int flag=0;
  for(i=0;i<n;i++)
  {
    if(a[i]==reg)
      
    {     
      flag++;
    break;
    }
  }
  if(flag==1)
    std::cout<<"She passed her exam";
  else
    std::cout<<"She failed";
}
  