import java.util.Scanner;

public class Lv01_Problem03_CharArrayComparison {

    // Method to return all characters in a string without using toCharArray()
    public static char[] getCharacters(String text) {
        char[] characters = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            characters[i] = text.charAt(i);
        }
        return characters;
    }

    // Method to compare two character arrays
    public static boolean compareCharArrays(char[] array1, char[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the string
        System.out.print("Enter a string: ");
        String inputString = scanner.next();

        // Get characters using the user-defined method
        char[] userDefined = getCharacters(inputString);
        System.out.print("Characters using user-defined method: ");
        for (char ch : userDefined) {
            System.out.print(ch + " ");
        }
        System.out.println();

        // Get characters using String's built-in toCharArray() method
        char[] builtInChars = inputString.toCharArray();
        System.out.print("Characters using toCharArray(): ");
        for (char ch : builtInChars) {
            System.out.print(ch + " ");
        }
        System.out.println();

        // Compare the two character arrays
        boolean areEqual = compareCharArrays(userDefined, builtInChars);
        System.out.println("Are the character arrays equal? " + areEqual);

        // Close the scanner
        scanner.close();
    }
}
