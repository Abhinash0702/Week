import java.util.Scanner;

public class Lv02_Program08_Percentage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       //taking input from the user
	   System.out.println("Enter the number of student");
	   
	   int number=input.nextInt();
	   
	   //checking if the number is positive or not
	   if(number<=0){
		   System.out.println("enter the valid number");
		   return;
	   }
	   
	   //defing the arrays		
		double physics[]=new double[number];
		double chemistry[]=new double[number];
		double maths[]=new double[number]; 
		double percentage[]=new double[number];
		char grade[]=new char[number];
				
		//taking height and weight of a person as input
		for(int i=0;i<number;i++){
			
				System.out.print("Enter the marks of student in Physics");				
				physics[i]=input.nextDouble();
								
				System.out.print("Enter the marks of student in chemistry");
				chemistry[i]=input.nextDouble();				
				
				System.out.print("Enter the marks of student in maths");
				maths[i]=input.nextDouble();	
				
				if(physics[i]<0 || maths[i]<0 || chemistry[i]<0){
					System.out.println("enter valid marks");
					if(i>1){
						i--;
					}
					else{
						i=0;
					}
				}
			
		}
		
		for(int i=0;i<number;i++){
			double percen= ((physics[i]+ maths[i]+chemistry[i])/300)*100;
			percentage[i]=percen;
			
			if(percen>=80){
				grade[i]='A';
			}
			else if(percen>=70 && percen<=79){
				grade[i]='B';
			}
			else if(percen>=60 && percen<=69){
				grade[i]='C';
			}
			else if(percen>=50 && percen<=59){
				grade[i]='D';
			}
			else if(percen>=40 && percen<=49){
				grade[i]='E';
			}
			else{
				grade[i]='E';
			}
		}
		
		for(int i=0;i<number;i++){
			System.out.println("Student "+(i+1)+" Total Marks "+(physics[i]+ maths[i]+chemistry[i])+", Percentage: "+percentage[i]+"%, Grade: "+grade[i]);
		}
		
		
		input.close();
    }
}