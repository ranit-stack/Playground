#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int r,m,n;
  cin>>m>>n>>r;
  int req= pow(m,n);
  if(req>=r)
    cout<<"Doctor, you can proceed with your experiment.";
  else
    cout<<"Sorry Doctor! You need more bacteria.";
}