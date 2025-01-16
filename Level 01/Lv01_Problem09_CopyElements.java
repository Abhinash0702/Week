// Program to find the factors of a number and store them in an array
import java.util.Scanner;

public class Lv01_Problem09_CopyElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the rows and columns from the user
        System.out.print("Enter the no of rows: ");
        int row = scanner.nextInt();
		
		System.out.print("Enter the no of columns: ");
        int column = scanner.nextInt();

		int matrix[][]=new int[row][column];
		
		
		
        // getting values from the user
		
		System.out.println("Enter all the numbers");
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[0].length;j++){
				matrix[i][j]=scanner.nextInt();
			}
		}
        
		// Declaring 1-D Array
		int array1D[] = new int[row*column];
		
        int index=0; // initializing the index

        //copying elements from 2D -> 1D array
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[0].length;j++){
				array1D[index++]=matrix[i][j];
				
			}
		}
		
		//Displaying elements from 1D array
		for(int i=0;i<array1D.length;i++){
			System.out.print(array1D[i]+" ");
		}
		System.out.println();

        scanner.close();
    }
}
