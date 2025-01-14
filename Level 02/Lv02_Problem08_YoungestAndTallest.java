import java.util.Scanner;

public class Lv02_Problem08_YoungestAndTallest {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Take user input for ages and heights of the 3 friends
        System.out.print("Enter Amar's age: ");
        int ageAmar = input.nextInt();
        System.out.print("Enter Amar's height (in cm): ");
        int heightAmar = input.nextInt();

        System.out.print("Enter Akbar's age: ");
        int ageAkbar = input.nextInt();
        System.out.print("Enter Akbar's height (in cm): ");
        int heightAkbar = input.nextInt();

        System.out.print("Enter Anthony's age: ");
        int ageAnthony = input.nextInt();
        System.out.print("Enter Anthony's height (in cm): ");
        int heightAnthony = input.nextInt();

        // Find the youngest friend by comparing the ages
        int youngestAge = Math.min(ageAmar, Math.min(ageAkbar, ageAnthony));
        String youngestFriend = "";
        if (youngestAge == ageAmar) {
            youngestFriend = "Amar";
        } else if (youngestAge == ageAkbar) {
            youngestFriend = "Akbar";
        } else {
            youngestFriend = "Anthony";
        }

        // Find the tallest friend by comparing the heights
        int tallestHeight = Math.max(heightAmar, Math.max(heightAkbar, heightAnthony));
        String tallestFriend = "";
        if (tallestHeight == heightAmar) {
            tallestFriend = "Amar";
        } else if (tallestHeight == heightAkbar) {
            tallestFriend = "Akbar";
        } else {
            tallestFriend = "Anthony";
        }

        // Display the results
        System.out.println(youngestFriend + " is the youngest with age " + youngestAge + " years.");
        System.out.println(tallestFriend + " is the tallest with height " + tallestHeight + " cm.");

        // Close the Scanner object
        input.close();
    }
}
