import java.util.Random;

public class Lv03_Program01_PlayerHeights {
    public static void main(String[] args) {
        int[] heights = generateRandomHeights(11, 150, 250);
        int shortest = findShortestHeight(heights);
        int tallest = findTallestHeight(heights);
        double mean = findMeanHeight(heights);

        System.out.println("Player Heights (in cm):");
        for (int height : heights) {
            System.out.print(height + " ");
        }                                                                          
        System.out.println("\n\nShortest Height: " + shortest + " cm");
        System.out.println("Tallest Height: " + tallest + " cm");
        System.out.println("Mean Height: " + String.format("%.2f", mean) + " cm");
    }

    private static int[] generateRandomHeights(int count, int min, int max) {
        Random random = new Random();
        int[] heights = new int[count];
        for (int i = 0; i < count; i++) {
            heights[i] = random.nextInt(max - min + 1) + min;
        }
        return heights;
    }

    private static int findShortestHeight(int[] heights) {
        int shortest = Integer.MAX_VALUE;
        for (int height : heights) {
            if (height < shortest) {
                shortest = height;
            }
        }
        return shortest;
    }

    private static int findTallestHeight(int[] heights) {
        int tallest = Integer.MIN_VALUE;
        for (int height : heights) {
            if (height > tallest) {
                tallest = height;
            }
        }
        return tallest;
    }

    private static double findMeanHeight(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return (double) sum / heights.length;
    }
}
