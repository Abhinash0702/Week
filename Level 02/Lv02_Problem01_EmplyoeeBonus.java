// Program to find the factors of a number and store them in an array
import java.util.Scanner;

public class Lv02_Problem01_EmplyoeeBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        	
		
		//declaring the arrays
		double salary[]=new double[10];
		int experience[]=new int[10];
		
		
		//iterating till the number and storing values
		for(int i=0;i<10;i++){
			System.out.println("Enter the salary of employee "+(i+1));
			salary[i]=input.nextDouble();		
			
			if(salary[i]<=0){
				System.out.println("Invalid salary!, Enter again" );
				i--;
				continue;
			}
			
			System.out.println("Enter the experience of employee "+(i+1));
			experience[i]=input.nextInt();
			
			if(experience[i]<=0){
				System.out.println("Invalid salary!, Enter again" );
				i--;
				continue;
			}
			
		}
		
		//declaring new salary array to store new salary of employees
		double newSalary[]=new double[10];
		
		double totalBonus=0.0; double totalNewSalary=0.0; double totalOldSalary=0.0;
		
		
		//calculating the total bonus, old salary, new salary
		for(int i=0;i<10;i++){
			double bonus ;// to calculate bonus of every employee
			
			if(experience[i]>=5){
				 bonus =salary[i]*1.05;				
				newSalary[i]=salary[i]+bonus;
			}
			else{
				 bonus =salary[i]*1.05;				
				newSalary[i]=salary[i]+bonus;
			}
			totalBonus+=bonus;
			totalNewSalary+=newSalary[i];
			totalOldSalary+=salary[i];
		}
		
		//printing total bonus, old salary, new salary
		System.out.println("Total bonus : "+totalBonus);
		System.out.println("Total old salary : "+totalOldSalary);
		System.out.println("Total New salary : "+totalNewSalary);
        input.close();
    }
}
