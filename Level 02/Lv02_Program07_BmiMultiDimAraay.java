import java.util.Scanner;

public class Lv02_Program07_BmiMultiDimAraay {
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
		double personData[][]=new double[number][3]; //{height,weight,bmi}
		String weightStatus[]=new String[number];
				
		//taking height and weight of a person as input
		for(int i=0;i<personData.length;i++){
			
				System.out.println("Enter the Height(in meter) and weight of person : "+(i+1));
				personData[i][0]=input.nextDouble();
				personData[i][1]=input.nextDouble();
			
		}
		
		//calculating the bmi of employees
		for(int i=0;i<number;i++){
			double curBmi=personData[i][1]/(personData[i][0]*personData[i][0]);
			personData[i][2]=curBmi;
			
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
		for(int i=0;i<number;i++){
			System.out.println("person "+(i+1)+" weight : "+personData[i][1]+", height : "+personData[i][0]+ "m, bmi is : "+ personData[i][2]+", Status : "+weightStatus[i]);
		}
		
		
		
        input.close();
    }
}