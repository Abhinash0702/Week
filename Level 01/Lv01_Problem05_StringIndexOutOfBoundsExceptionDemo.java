import java.util.Scanner;

public class Lv01_Problem05_StringIndexOutOfBoundsExceptionDemo {

    // Method to generate StringIndexOutOfBoundsException
    public static void generateException(String text) {
        System.out.println("Accessing character at an invalid index...");
		
        System.out.println("Character at index " + text.length() + ": " + text.charAt(text.length()));
    }

    // Method to handle StringIndexOutOfBoundsException
    public static void handleException(String text) {
        try {
            System.out.println("Accessing character at an invalid index...");
			
            System.out.println("Character at index " + text.length() + ": " + text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            // Handling the exception
            System.out.println("Caught StringIndexOutOfBoundsException: Invalid index accessed.");
            System.out.println("Exception message: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the string
        System.out.print("Enter a string: ");
        String inputString = scanner.next();

        // Step 1: Call the method to generate the exception
        System.out.println("\nStep 1: Demonstrating StringIndexOutOfBoundsException:");
        try {
            generateException(inputString);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }

        // Step 2: Call the method to handle the exception
        System.out.println("\nStep 2: Handling StringIndexOutOfBoundsException gracefully:");
        handleException(inputString);

        // Closing the scanner
        scanner.close();
    }
}
