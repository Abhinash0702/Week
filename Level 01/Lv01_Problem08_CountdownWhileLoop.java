import java.util.Scanner;

public class Lv01_Problem08_CountdownWhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input countdown start value
        System.out.print("Enter the starting value for the countdown: ");
        int counter = input.nextInt();

        // Countdown loop
        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }
        System.out.println("Liftoff!");

        // Close the scanner
        input.close();
    }
}
