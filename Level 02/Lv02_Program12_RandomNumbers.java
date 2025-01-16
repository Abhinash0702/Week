public class Lv02_Program12_RandomNumbers {

    // Method to generate an array of 4-digit random numbers
    public static int[] generate4DigitRandomArray(int size) {
        int[] numbers = new int[size];
        
        for (int i = 0; i < size; i++) {
            // Generate a random number between 1000 and 9999
            numbers[i] = (int) (Math.random() * 9000) + 1000;
        }
        
        return numbers;
    }

    // Method to find the average, min, and max value of an array
    public static double[] findAverageMinMax(int[] numbers) {
        double sum = 0;
        int min = numbers[0];
        int max = numbers[0];
        
        // Traverse through the array to find sum, min, and max
        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num); // Find minimum value
            max = Math.max(max, num); // Find maximum value
        }
        
        // Calculate the average value
        double average = sum / numbers.length;
        
        // Return the average, min, and max as an array
        return new double[] {average, min, max};
    }

    public static void main(String[] args) {
        int size = 5; // Size of the array (5 random numbers)
        
        // Generate 5 random 4-digit numbers
        int[] randomNumbers = generate4DigitRandomArray(size);
        
        // Find the average, min, and max values
        double[] result = findAverageMinMax(randomNumbers);
        
        // Display the random numbers
        System.out.print("Random 4-digit numbers: ");
        for (int num : randomNumbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        // Display the results
        System.out.println("Average: " + result[0]);
        System.out.println("Minimum value: " + result[1]);
        System.out.println("Maximum value: " + result[2]);
    }
}
