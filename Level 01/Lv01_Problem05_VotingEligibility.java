import java.util.Scanner;

public class Lv01_Problem05_VotingEligibility {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input the age
        System.out.print("Enter the person's age: ");
        int age = input.nextInt();

        // Check voting eligibility
        if (age >= 18) {
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            System.out.println("The person's age is " + age + " and cannot vote.");
        }

        // Close the scanner
        input.close();
    }
}
