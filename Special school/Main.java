#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  //Type your code here.
  char a1[50],a2[50];
  char a3;
  gets(a1);
  gets(a2);
  int i,j=strlen(a2)-1;
  for(i=0;i<j;i++,j--)
  {
    a3=a2[i];
    a2[i]=a2[j];
    a2[j]=a3;
  }
  if(strcmp(a1,a2)==0)
    cout<<"It is correct";
  else
    cout<<"It is wrong";
  }
  
  
