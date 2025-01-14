import java.util.Scanner;

public class Lv02_Problem07_BMI {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Prompt the user for weight in kg and height in cm
        System.out.print("Enter your weight (in kg): ");
        double weight = input.nextDouble();

        System.out.print("Enter your height (in cm): ");
        double heightCm = input.nextDouble();

        // Convert height from cm to meters
        double heightM = heightCm / 100;

        // Calculate BMI using the formula: BMI = weight / (height in meters * height in meters)
        double bmi = weight / (heightM * heightM);

        // Print the BMI result
        System.out.printf("Your BMI is: %.2f\n", bmi);

        // Determine and print the weight status based on the BMI value
        if (bmi < 18.4) {
            System.out.println("Underweight");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("Normal weight");
        } else if (bmi >= 25 && bmi < 39.9) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obesity");
        }

        // Close the Scanner object
        input.close();
    }
}
