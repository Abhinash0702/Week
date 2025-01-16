import java.util.Scanner;

public class Lv02_Program04_SecondLargestElementUpdated {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       //taking input from the user
	   System.out.println("Enter the number");
	   
	   long number=input.nextLong();
	   
	   //checking if the number is positive or not
	   if(number<=0){
		   System.out.println("enter the valid number");
		   return;
	   }
	   
	   //defing variables and array
		int maxDigit=10;
		int digit[]=new int[maxDigit];
		int index=0;
		
		
		//while loop to iterate through each digit of a number
		while(number>0){
			
			//to increase the length of array 
			if(index==maxDigit){
				System.out.println("inside maxDigit");
				maxDigit*=2;
				int temp[]=new int[maxDigit];
				System.arraycopy(digit,0,temp,0,digit.length);
				digit=temp;
			}
			
			int rem=(int)number%10;
			digit[index++]=rem;
			number/=10;			
			
		}
		
		int largest=-1;
		int secondLargest=-1;
		
		//finding the largest and secondLargest digit
		for(int i=0;i<digit.length;i++){
			if(digit[i]>largest){
				secondLargest=largest;
				largest=digit[i];
				//System.out.println("Largest digit is inside loop: "+largest );
			}
			else if(digit[i]>secondLargest && digit[i]<largest){
				secondLargest=digit[i];
			}
			
		
		}
		
		//displaying the secondLargest and largest digit
		System.out.println("Largest digit is : "+largest );
		System.out.println("Second Largest digit is : "+secondLargest );
		
        input.close();
    }
}
