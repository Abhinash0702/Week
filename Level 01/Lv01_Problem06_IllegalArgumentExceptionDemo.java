import java.util.*;

public class Lv01_Problem07_NumberFormatExceptionDemo {
    
    // Method to generate IllegalArgumentException
    public static void generateException(String str) {
		
        System.out.println("Generating Exception...");
        int result = Integer.parseInt(5,2); // This will throw StringIndexOutOfBoundsException
        System.out.println(result);
    }
    
    // Method to handle IllegalArgumentException and generic runtime exception
    public static void handleException(String str) {
        try {
            // Call the method that generates the exception
            generateException(str);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e.getMessage());
        } finally {
            System.out.println("Execution completed.");
        }
    }

    public static void main(String[] args) {
        // Create scanner to take user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for input
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();
        
        // Close the scanner object
        scanner.close();
        
        // Call the method to handle IllegalArgumentException
        handleException(userInput);
    }
}
