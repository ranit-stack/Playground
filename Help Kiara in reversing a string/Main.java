#include<iostream>
#include<string.h>
using namespace std;
int main ()
{
    char str[50], temp,r[50];
    int i, j,end;
   
    gets(str);
    j = strlen(str) - 1;
    for (i = j,end=0; i>=0; i--,end++)
    {
        r[end]=str[i];
    }
    cout <<r;
    return 0;
}