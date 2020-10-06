#include<iostream>
int main()
{
    // Type your code here
  int r,c,i,j;
  std::cin>>r>>c;
  int a[r][c],b[c][r];
   for(int i = 0; i < r; i++){
        for(int j = 0; j < c; j++){
            std::cin>>a[i][j];
        }
   }
   
   for(int i = 0; i < c; i++){
        for(int j = 0; j < r; j++){
            std::cout<<a[j][i]<<" ";
        }
     std::cout<<"\n";
   }
  
}