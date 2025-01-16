import java.util.Scanner;

public class Lv02_Program06_BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       //taking input from the user
	   System.out.println("Enter the number of employee");
	   
	   int number=input.nextInt();
	   
	   //checking if the number is positive or not
	   if(number<=0){
		   System.out.println("enter the valid number");
		   return;
	   }
	   
	   //defing the arrays		
		double weight[]=new double[number];
		double height[]=new double[number];
		double bmi[]=new double[number];
		String weightStatus[]=new String[number];
				
		//taking height and weight of a person as input
		for(int i=0;i<weight.length;i++){
			System.out.println("Enter the Height(in meter) and weight of person : "+(i+1));
			height[i]=input.nextDouble();
			weight[i]=input.nextDouble();
		}
		
		//calculating the bmi of employees
		for(int i=0;i<weight.length;i++){
			double curBmi=weight[i]/(height[i]*height[i]);
			bmi[i]=curBmi;
			
			if(curBmi<=18.4){
				weightStatus[i]="UnderWeight";
			}
			else if(curBmi>=18.5 && curBmi < 24.9){
				weightStatus[i]="Normal";
			}
			else if(curBmi>25.0 && curBmi<39.9){
				weightStatus[i]="OverWeight";
			}
			else{
				weightStatus[i]="Obese";
			}
		}
		
		// displaying info of each person
		for(int i=0;i<weight.length;i++){
			System.out.println("person "+(i+1)+" weight : "+weight[i]+", height : "+height[i]+ "m, bmi is : "+bmi[i]+", Status : "+weightStatus[i]);
		}
		
		
		
        input.close();
    }
}