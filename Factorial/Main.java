#include<iostream>
int main()
{
  //Type your code here.
  int n;
  std::cin>>n;
  long fact=1;
  int i;
  for(i=1;i<=n;i++)
  {
    fact=fact*i;
  }
  std::cout<<"The factorial of "<<n<<" is "<<fact;
}