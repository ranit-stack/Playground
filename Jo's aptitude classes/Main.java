#include<iostream>
using namespace std;
int main()
{
  int a,b,c,ans;
  cin>>a>>b>>c>>ans;
  int max=(a>b?(a>c)?a:c:(b>c)?b:c);

  int hcf,gcd;
  for(hcf=max;hcf>=0;hcf--)
  {
    if(((a%hcf)==0) && ((b%hcf==0)) && ((c%hcf)==0))
    {
      gcd=hcf;
      break;
    }
  }
  if(gcd==ans)
    cout<<"Answer is correct.";
  else
    cout<<"Answer is wrong.";
}
