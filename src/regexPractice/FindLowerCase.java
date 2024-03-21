package regexPractice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindLowerCase {

	
	/*
	 * There are three main classes in Regex : Pattern, Matcher, PatternSyntaxException
	 * 
	 */
	
	public static void main(String[] args) {
		//Find only lower case letters from the string.
		
		String s = "Sele$@#nium1234Java@679";
		
		//declare pattern to find values in the given string
		//Here we are creating a pattern for all the lower case letters
		
		Pattern p = Pattern.compile("[a-z]");//not it finds for all the lower case letters from a to z in the given string after using
		//matchers method which returns a Matcher class
		
		Matcher m = p.matcher(s); //here we provide the string as target to find the pattern
		
		String b ="";
		while(m.find()) {
			
//			System.out.println(m.group());// it prints all the lower case letters from the string 
			
			b += m.group();
//		System.out.println(m.start()+" "+m.group());	//If this is used it even prints the position of all the lowercase letters.
			
			//here m.group() method return a characters from the extracted matched values from the string until the loop terminates i.e there are no charactes left
		}
		
		System.out.println(b);
	}
}
