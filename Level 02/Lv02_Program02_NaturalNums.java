import java.util.Scanner;

public class Lv02_Program02_NaturalNums{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int number = input.nextInt();
        if (number <= 0) {
            System.out.println("Please enter a valid positive number.");
            return;
        }
		
		int rsum=recursiveSum(number);
		int fsum=(number*(number-1))/2; 
		
        System.out.println("Sum using recursion: " + rsum);
        System.out.println("Sum using formula: " + fsum);
        System.out.println("Both results are " + (rsum == fsum ? "correct" : "incorrect"));
		

    }
	public static int recursiveSum(int number){
		if(number==1){
			return 1;
		}
		return number + recursiveSum(number-1);
		
	}
	 
}
