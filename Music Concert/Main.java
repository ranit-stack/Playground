#include<iostream>
#include<cstdlib>
int main(){
  // Type your code here
  int n;
  std::cin>>n;
  int *a=(int *)malloc(n*sizeof(int));
  int i;
  for(i=0;i<n;i++)
  {
    std::cin>>a[i];
  }
  int male=0,female=0;
  for(i=0;i<n;i++)
  {
    if(a[i]%2==0)
      female++;
    else
      male++;
  }
  std::cout<<male<<"\n"<<female;
  return 0;
}