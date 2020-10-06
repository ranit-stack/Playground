#include<iostream>
int main()
{
    // Type your code here
  int i,j,k,l,m,n,r,c;
  std::cin>>r>>c;
  int a1[r][c],a2[r][c],a3[r][c];
   for(int i = 0; i < r; i++){
        for(int j = 0; j < c; j++){
            std::cin>>a1[i][j];
        }
   }
   for(int i = 0; i < r; i++){
        for(int j = 0; j < c; j++){
            std::cin>>a2[i][j];
        }
   }
   for(int i = 0; i < r; i++){
        for(int j = 0; j < c; j++){
            a3[i][j]=a1[i][j]+a2[i][j];
        }
   }
   for(int i = 0; i < r; i++){
        for(int j = 0; j < c; j++){
            std::cout<<a3[i][j]<<" ";
        }
     std::cout<<"\n";
   }
}