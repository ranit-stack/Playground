#include<bits/stdc++.h>
using namespace std;

int main(){    
   int num,  rem,  temp; 
  int sum=0;
   cin>>num;  
   temp = num;   
   while(num > 0)    
   {        
  	rem = num % 10;  
	sum = (sum*10) + rem; 
 	num /= 10;   
   }
   if(temp==sum)    
   {        
 	cout<<"Palindrome";   
   }    
   else   
   {       
 	cout<<"Not Palindrome";   
   }   
}

 
	

