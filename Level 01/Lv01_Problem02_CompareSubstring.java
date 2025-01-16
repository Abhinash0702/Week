import java.util.Scanner;

public class Lv01_Problem02_CompareSubstring{
	
	//Method to create substring using charAt() method
	public static String createSubString(String str , int start , int end){
		String s="";
		for(int i=start; i<=end;i++){
			s+=str.charAt(i);
		}
		return s;
	}	
	
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
	
	
	
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		
		//taking string, start, and end as input from the user
		System.out.print("Enter String 1");
		String str=input.next();
		
		System.out.print("Enter Start index");
		int start=input.nextInt();
		System.out.print("Enter end index");
		int end=input.nextInt();
		
		//substring using charAt()
		String subString_charAt=createSubString(str,start,end);
		System.out.println("Substring using .charAt() method -> "+ subString_charAt);
		
		//substring using substring()
		String builtIn = str.substring(start,end+1);
		System.out.println("Substring using .subString() method -> "+ builtIn );
		
		boolean areEqual=compareString(subString_charAt,builtIn); 
		
		System.out.println("are the substring equal? "+areEqual);
		
		input.close();
		
		
	}
}