#include<stdio.h>
int dec_to_oct(int n)
{
    //Your code goes here
  int rem=0,rev,power=1;
   while(n!=0)
    {
        rem=n%8;
        rev=rev+rem*power;
        n/=8;
        power=power*10;
    }
    return rev;

}
int main()
{
    int n;
    scanf("%d",&n);
    printf("%d",dec_to_oct(n));
}
