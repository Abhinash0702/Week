import java.util.HashSet;
import java.util.Set;

public class Lv03_Program07_OTPGenerator {

    // Method to generate a 6-digit OTP number using Math.random()
    public static int generateOTP() {
        // Generate a random number between 100000 and 999999 (6-digit number)
        return 100000 + (int)(Math.random() * 900000);
    }

    // Method to ensure that the OTP numbers generated are unique
    public static boolean areOTPsUnique(int[] otpArray) {
        Set<Integer> otpSet = new HashSet<>();

        // Add each OTP to the set. If a duplicate is encountered, return false
        for (int otp : otpArray) {
            if (!otpSet.add(otp)) {
                return false; // Duplicate found
            }
        }
        return true; // All OTPs are unique
    }

    public static void main(String[] args) {
        // Array to store 10 OTP numbers
        int[] otpArray = new int[10];

        // Generate 10 OTPs and store them in the array
        for (int i = 0; i < 10; i++) {
            otpArray[i] = generateOTP();
        }

        // Display generated OTPs
        System.out.println("Generated OTPs:");
        for (int otp : otpArray) {
            System.out.println(otp);
        }

        // Check if the OTPs are unique
        if (areOTPsUnique(otpArray)) {
            System.out.println("All OTPs are unique.");
        } else {
            System.out.println("Some OTPs are duplicated.");
        }
    }
}
