#include<iostream>
#include<math.h>
using namespace std;
int power(int,int);
int main()
{
  //Type your code here.
  int a,n;
  std::cout<<"Enter the value of a\n";
  std::cin>>a;
  std::cout<<"Enter the value of n\n";
  std::cin>>n;
  int result=power(a,n);
  cout<<"The value of "<<a<<" power "<<n<<" is "<<result;
  return 0;
}
int power(int a,int n)
{
 int res=pow(a,n);
  return res;
}