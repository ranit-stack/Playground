#include<stdio.h>
#include<math.h>
int bin_to_dec(int n)
{
    //Your code goes here
  int dec=0,i=0,digit=0;
  while(n!=0)
  {
    digit=n%10;
    dec=dec+(digit*pow(2,i));
    i++;
    n=n/10;
  }
  return dec;
}
int main()
{
    int n;
    scanf("%d",&n);
    printf("%d",bin_to_dec(n));
}