import java.util.Scanner;

public class Lv01_Program10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your height in cm: ");
        double heightCm = input.nextDouble(); // User input for height in cm

        double inches = heightCm / 2.54; // Convert cm to inches
        int feet = (int) (inches / 12); // Convert inches to feet
        inches = inches % 12; // Remaining inches

        System.out.println("Your height in cm is " + heightCm + 
                           " while in feet is " + feet + " and inches is " + inches);
    }
}
