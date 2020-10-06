import java.util.Scanner;
 class Main {

    public static void main(String[] args) {
        int row = 2, column = 3;
        int[][] matrix = { {2, 3, 4}, {5, 6, 4} };
      int[][] matrix1={ {2,5},{3,6},{4,4}};
		//Try out your code here
     
      display(matrix1);
        
    }
  
    public static void display(int[][] matrix) {
        for(int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }
}
    
   