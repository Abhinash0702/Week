import java.util.Scanner;

public class Lv01_Problem01_CompareTwoString{
	
	//Method to compare two string using .charAt() method
	public static boolean compareString(String str1, String str2){ 
	
		if(str1.length()!=str2.length()){
			return false;
		}	

		for(int i=0;i<str1.length();i++){
			if(str1.charAt(i)!=str2.charAt(i)){
				return false;
			}
		}
		return true;
	}
	
	//Method to compare two string using .equals() method
	public static boolean compareByMethod(String str1, String str2){
		if(str1.equals(str2)){
			return true;
		}
		return false;
	}
	
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		
		//taking string as input from the user
		System.out.print("Enter String 1");
		String str1=input.next();
		
		System.out.print("Enter String 1");
		String str2=input.next();
		
		boolean result1=compareString(str1,str2);
		System.out.println("comparing through .charAt(), Are both the strings equal? --> "+result1);
		
		boolean result2=compareByMethod(str1,str2);
		System.out.println("comparing through inbuilt fn .equals(), Are both the strings equal? -->"+result1);
		System.out.println();
		if(result1==result2){
			System.out.println("Result from both the methods is same");
		}
		
	}
}