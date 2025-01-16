import java.util.Scanner;

public class Lv01_Problem01_VotingCheck {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);
		
        int personAge[]= new int[10];  // defining an array
		
		//Taking age as input from user
		for(int i=0;i<personAge.length;i++){
			System.out.println("Enter the age of "+(i+1)+" Student");
			personAge[i]=input.nextInt();
		}
		
		//checking whether a student is eligible to vote or not
		for(int i=0;i<personAge.length;i++){
			if(personAge[i]<0){
				System.out.println("Invalid Age");
			}
			else if(personAge[i]>=18){
				System.out.println("The student with the age "+ personAge[i]+" can vote.");
			}
			else{
				System.out.println("The student with the age "+ personAge[i]+" cannot vote.");
			}
		}
		
		
        // Close the Scanner object
        input.close();
    }
}