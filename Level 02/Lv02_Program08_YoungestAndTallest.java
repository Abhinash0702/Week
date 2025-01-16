
import java.util.Scanner;

public class Lv02_Program08_YoungestAndTallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] ages = new int[3];
        double[] heights = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of friend " + (i + 1) + ": ");
            ages[i] = input.nextInt();
            System.out.print("Enter height of friend " + (i + 1) + " (in cm): ");
            heights[i] = input.nextDouble();
        }

        int youngest = findYoungest(ages);
        int tallest = findTallest(heights);

        System.out.println("The youngest friend is friend " + (youngest + 1) + " (Age: " + ages[youngest] + ").");
        System.out.println("The tallest friend is friend " + (tallest + 1) + " (Height: " + heights[tallest] + " cm).");

        input.close();
    }

    public static int findYoungest(int[] ages) {
        int minIndex = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static int findTallest(double[] heights) {
        int maxIndex = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}




