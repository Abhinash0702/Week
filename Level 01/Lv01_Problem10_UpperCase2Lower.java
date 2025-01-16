import java.util.*;

public class Lv01_Problem10_UpperCase2Lower {
    
	//method to convert uppercase to lowercase
	public static String UpperCase2LowerCase(String str){
		String s="";
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)>=65 && str.charAt(i)<=90){
				s+=(char)(str.charAt(i)+32);
			}
			else{
				s+=str.charAt(i);
			}
		}
		return s;
	}
	//method to compare 2 strings
	public static boolean compareString(String str1,String str2){
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
    public static void main(String[] args) {
        // Create scanner to take user input
        Scanner input = new Scanner(System.in);
        
		//taking string as input from the user
		System.out.print("enter something");
		String str=input.nextLine();
		
		String lowerCharAt=UpperCase2LowerCase(str);
		System.out.println("Uppercase string using charAt() --> "+ lowerCharAt);
		
		String lowerBuiltIn=str.toLowerCase();
		System.out.println("Uppercase string using builtIn toUpperCase() --> "+ lowerBuiltIn);
		
		//comparing both the lowecase strings
		boolean areEqual=compareString(lowerCharAt,lowerBuiltIn);
		System.out.println("are both string equal? , "+areEqual );
        
        input.close();
        
    }
}
