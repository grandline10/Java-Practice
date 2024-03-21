package regexPractice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AllRegexQuestions {
	
	static String s = "Sele$@#nium1234Java@679";
	static String password = "testSele$@#niuM1234Java@679";
	
	public static void main(String[] args) {
		
//		onlyUpperCase();
		
//		onlyNumbers();
		
		numberAndSpecial();
	}
	
	
	static void onlyUpperCase() {
		
		Pattern p = Pattern.compile("[A-Z]");
		Matcher m = p.matcher(s);
		
		String b = "";
		
		while(m.find()) {
			
			b+=m.group();
		}
		System.out.println(b);
	}
	
	
	static void onlyNumbers() {
		
		Pattern p = Pattern.compile("[0-9]");
		Matcher m =p.matcher(s);
		
		String b ="";
		
		while(m.find()) {
			
			b+=" "+m.group();
		}
		System.out.println(b);
	}
	
	
	static void numberAndSpecial() {
		Pattern p =Pattern.compile("(\\d)|(\\W)");
		
		Matcher m =p.matcher(s);
		
		String one = "";
		String two = "";
		
		
		while(m.find()) {
			
			if (!(m.group(1)==null)) one+= m.group(1);
			if(!(m.group(2)==null)) two +=m.group(2);
		}
		
		System.out.println(one);
		System.out.println(two);
	}
	
	
	//method to find out whether the password has all of UC, LC, special characters and numbers.

}
