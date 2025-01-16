import java.util.Random;

public class Lv03_Program11_EmployeeBonus {

    // Method to generate random salary and years of service for 10 employees
    public static double[][] generateEmployeeData() {
        Random random = new Random();
        double[][] employeeData = new double[10][2]; // 2D array to store salary and years of service
        
        for (int i = 0; i < 10; i++) {
            // Generate random salary between 30000 and 99999
            employeeData[i][0] = 30000 + (random.nextInt(70000)); // Random salary between 30000 and 99999
            
            // Generate random years of service between 1 and 20 years
            employeeData[i][1] = 1 + random.nextInt(20); // Random years of service between 1 and 20
        }
        
        return employeeData;
    }

    // Method to calculate new salary and bonus for each employee
    public static double[][] calculateNewSalaryAndBonus(double[][] employeeData) {
        double[][] updatedData = new double[10][3]; // 2D array to store new salary, old salary, and bonus
        
        for (int i = 0; i < 10; i++) {
            double oldSalary = employeeData[i][0];
            double yearsOfService = employeeData[i][1];
            double bonus = 0;
            
           
            if (yearsOfService > 5) {
                bonus = oldSalary * 0.05; 
            } else {
                bonus = oldSalary * 0.02; 
            }
            
            
            double newSalary = oldSalary + bonus;
            
            // Store old salary, bonus, and new salary in updatedData
            updatedData[i][0] = oldSalary; // Old salary
            updatedData[i][1] = bonus; // Bonus
            updatedData[i][2] = newSalary; // New salary
        }
        
        return updatedData;
    }

    // Method to calculate and display total sum of old salary, new salary, and total bonus
    public static void displaySummary(double[][] updatedData) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;
        
        // Display header
        System.out.println("Employee No. | Old Salary | Bonus  | New Salary");
        System.out.println("------------------------------------------------");

        // Display data for each employee and calculate totals
        for (int i = 0; i < 10; i++) {
            double oldSalary = updatedData[i][0];
            double bonus = updatedData[i][1];
            double newSalary = updatedData[i][2];
            
            // Display each employee's details
            System.out.printf("%12d | %.2f | %.2f | %.2f\n", i+1, oldSalary, bonus, newSalary);
            
            // Accumulate totals
            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;
        }
        
        // Display total sums
        System.out.println("------------------------------------------------");
        System.out.printf("Total Old Salary: %.2f\n", totalOldSalary);
        System.out.printf("Total New Salary: %.2f\n", totalNewSalary);
        System.out.printf("Total Bonus: %.2f\n", totalBonus);
    }

    public static void main(String[] args) {
        // Generate random salary and years of service data for 10 employees
        double[][] employeeData = generateEmployeeData();

        // Calculate the new salary and bonus for each employee
        double[][] updatedData = calculateNewSalaryAndBonus(employeeData);

        // Display the summary table with total salary and bonus information
        displaySummary(updatedData);
    }
}
