import java.util.Scanner;

public class Lv03_Program12_StudentScorecard {

    // Method to take input scores for Physics, Chemistry, and Math
    public static int[][] inputScores(int numStudents) {
        Scanner scanner = new Scanner(System.in);
        int[][] scores = new int[numStudents][3]; // 2D array to store PCM scores for all students
        
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter scores for Student " + (i + 1));
            System.out.print("Physics: ");
            scores[i][0] = scanner.nextInt();
            System.out.print("Chemistry: ");
            scores[i][1] = scanner.nextInt();
            System.out.print("Math: ");
            scores[i][2] = scanner.nextInt();
        }
        
        return scores;
    }

    // Method to calculate total, average, and percentage for each student
    public static double[][] calculateResults(int[][] scores) {
        double[][] results = new double[scores.length][4]; // 2D array to store total, average, percentage
        
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2]; // Calculate total
            double average = total / 3.0; // Calculate average
            double percentage = (total / 300.0) * 100; // Calculate percentage
            
            // Round the values to 2 decimal places
            results[i][0] = Math.round(total * 100.0) / 100.0; // Total
            results[i][1] = Math.round(average * 100.0) / 100.0; // Average
            results[i][2] = Math.round(percentage * 100.0) / 100.0; // Percentage
            results[i][3] = total; // Store total for display
        }
        
        return results;
    }

    // Method to display the scorecard of all students
    public static void displayScorecard(int[][] scores, double[][] results) {
        System.out.println("Student No. | Physics | Chemistry | Math | Total | Average | Percentage");
        System.out.println("-----------------------------------------------------------------------");
        
        for (int i = 0; i < scores.length; i++) {
            // Display each student's scores, total, average, and percentage
            System.out.printf("%12d | %7d | %9d | %4d | %5.2f | %7.2f | %10.2f\n", 
                              i + 1, scores[i][0], scores[i][1], scores[i][2], 
                              results[i][0], results[i][1], results[i][2]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ask for the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        
        // Take input scores for the students
        int[][] scores = inputScores(numStudents);
        
        // Calculate total, average, and percentage for each student
        double[][] results = calculateResults(scores);
        
        // Display the scorecard
        displayScorecard(scores, results);
        
        // Close the scanner
        scanner.close();
    }
}
