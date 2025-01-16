import java.util.Scanner;

public class Lv02_Program02_YoungestAndTallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define arrays to store ages and heights of the 3 friends
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Input data for the 3 friends
        System.out.println("Enter the age and height of Amar:");
        ages[0] = scanner.nextInt();
        heights[0] = scanner.nextDouble();

        System.out.println("Enter the age and height of Akbar:");
        ages[1] = scanner.nextInt();
        heights[1] = scanner.nextDouble();

        System.out.println("Enter the age and height of Anthony:");
        ages[2] = scanner.nextInt();
        heights[2] = scanner.nextDouble();

        // Find the youngest friend
        int youngestIndex = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
        }

        // Find the tallest friend
        int tallestIndex = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        // Names of the friends for reference
        String[] names = {"Amar", "Akbar", "Anthony"};

        // Display the youngest and tallest friends
        System.out.println("The youngest friend is " + names[youngestIndex] + " with age " + ages[youngestIndex] + ".");
        System.out.println("The tallest friend is " + names[tallestIndex] + " with height " + heights[tallestIndex] + " meters.");

        scanner.close();
    }
}
