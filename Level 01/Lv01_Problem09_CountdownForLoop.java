import java.util.Scanner;

public class Lv01_Problem09_CountdownForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input countdown start value
        System.out.print("Enter the starting value for the countdown: ");
        int counter = input.nextInt();

        // Countdown loop
        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("Liftoff!");

        // Close the scanner
        input.close();
    }
}
