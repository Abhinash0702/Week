
import java.util.Scanner;

public class Lv01_Problem02_Numbers {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);
		
        int number[]= new int[5];  // defining an array
		
		//Taking age as input from user
		for(int i=0;i<number.length;i++){
			System.out.println("Enter the "+(i+1)+" Number");
			number[i]=input.nextInt();
		}
		
		//checking whether a 
		for(int i=0;i<number.length;i++){
			if(number[i]<0){
				System.out.println("The number "+number[i]+" is negative");
			}
			else if(number[i]>0){
				if(number[i]%2==0){
					System.out.println("the number "+number[i]+" is even");
				}
				else{
					System.out.println("the number "+number[i]+" is odd");
				}
			}
			else{
				System.out.println("The given no is Zero");
			}
		}
		if(number[0]==number[number.length-1]){
			System.out.println("First and last numbers are Equal");
		}
		else if(number[0]<number[number.length-1]){
			System.out.println("First no. "+number[0] +" is less than the last number "+number[number.length-1] );
		}
		else{
			System.out.println("First no. "+number[0] +" is greater than the last number "+number[number.length-1] );
		}
		
		
        // Close the Scanner object
        input.close();
    }
}



