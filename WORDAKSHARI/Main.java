#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  //Type your code here.
  char a[50][50];
  int i,n=0;
  for(i=0;i<10;i++)
    
  {
    gets(a[i]);
    n++;
    if(strcmp(a[i],"####")==0)
      break;
  }
  printf("%s\n",a[0]);
  for(i=0;i<n;i++)
  {
    if(a[i][strlen(a[i])-1]==a[i+1][0])
      printf("%s\n",a[i+1]);
  }
  
}