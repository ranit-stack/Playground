#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  //Type your code here.
  char name[50];
  gets(name);
  int count=0,i=0;
  while(name[i]!='\0')
  {
    count++;
    i++;
  }
  cout<<"The number of letters in the name is "<<count;
           
}