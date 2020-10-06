import java.util.Scanner;
class Main
{
   public static void main(String args[])
   {
	int counter, i=0, j=0, temp;
	int number[] = new int[100];
	Scanner scanner = new Scanner(System.in);
	counter = scanner.nextInt();
	for(i=0; i<counter; i++)
	{
	    number[i] = scanner.nextInt();
	}
	j = i - 1;     
	i = 0;         
	scanner.close();
	//Try out your code here
     int b[]=new int[100];
     int k=0;
     for(i=j;i>=0;i--)
     {
      b[k]=number[i];
       k++;
     }
	for(i=0; i<counter; i++)
	{
	   System.out.print(b[i]+ "  ");
	}       
   }
}
    