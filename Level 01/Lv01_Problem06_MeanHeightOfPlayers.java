import java.util.Scanner;

public class Lv01_Problem06_MeanHeightOfPlayers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array to store heights of players
        double[] heights = new double[11];
        double sum = 0.0;

        System.out.println("Enter the heights of 11 players:");

        // Get heights of players
        for (int i = 0; i < 11; i++) {
            System.out.print("Height of player " + (i + 1) + ": ");
            heights[i] = scanner.nextDouble();
            sum += heights[i];
        }

        // Calculate mean height
        double meanHeight = sum / 11;

        // Display the mean height
        System.out.printf("The mean height of the football team is: %.2f\n", meanHeight);

        scanner.close();
    }
}