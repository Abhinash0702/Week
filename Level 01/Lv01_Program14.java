import java.util.Scanner;
public class Lv01_Program14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the distance in feet: ");
        double feet = input.nextDouble(); // Distance in feet

        double yards = feet / 3; // Convert to yards
        double miles = yards / 1760; // Convert to miles

        System.out.println("The distance in yards is " + yards + 
                           " and in miles is " + miles + " for the given " + feet + " feet.");
		input.close();
    }
}