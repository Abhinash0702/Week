// Program to find the factors of a number and store them in an array
import java.util.Scanner;

public class Lv01_Problem10_FizzBuzzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number from the user
        System.out.print("Enter the number ");
        int number = scanner.nextInt();		
		
		//declaring the array which will store numbers/Fizz/Buzz/FizzBuzz;
		String fizzBuzz[]=new String[number];
		
		
		//iterating till the number and storing values
		for(int i=1;i<=number;i++){
			
			if(i%3==0 && i%5==0){
				fizzBuzz[i-1]="FizzBuzz";
			}
			else if(i%3==0){
				fizzBuzz[i-1]="Fizz";
			}
			else if(i%5==0){
				fizzBuzz[i-1]="Buzz";
			}
			
			else{
				fizzBuzz[i-1]=String.valueOf(i);
			}
		}
				
		
		//printing the values
		for(int i=0;i<fizzBuzz.length;i++){
			System.out.println("Position "+(i+1)+" = "+fizzBuzz[i]);
		}
		
	
        scanner.close();
    }
}
