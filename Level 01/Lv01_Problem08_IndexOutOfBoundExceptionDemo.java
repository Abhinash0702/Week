import java.util.*;

public class Lv01_Problem08_IndexOutOfBoundExceptionDemo {
    
    // Method to generate NumberFormatException
    public static void generateException(String str[]) {
		
        System.out.println("Generating Exception...");
        String result = str[str.length]; // This will throw IndexOutOfBoundsException
        System.out.println(result);
    }
    
    // Method to handle IllegalArgumentException and generic runtime exception
    public static void handleException(String name[]) {
        try {
            // Call the method that generates the exception
            generateException(name);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("caught IndexOutOfBoundsException: " + e.getMessage());
        } 
        finally {
            System.out.println("Execution completed.");
        }
    }

    public static void main(String[] args) {
        // Create scanner to take user input
        Scanner input = new Scanner(System.in);
        
		System.out.print("Enter number of students: ");
        int number = input.nextInt();
		
		String name[]=new String[number];
        // taking input from the user
		for(int i=0;i<number;i++){
			System.out.println("Enter the name of student : "+(i+1));
			name[i]=input.next();
		}
        
        
        input.close();
        
        // Call the method to handle IllegalArgumentException
        handleException(name);
    }
}
