package interview;

import java.util.Scanner;

public class NumberToString {
	
	static String s1;
	static String s2;
	
	public static void main(String[] args) {
		System.out.print("Enter any number lesss than 10000: ");
		Scanner s = new Scanner(System.in);
		int number = s.nextInt();
		
		if(number<0 || number > 9999) System.out.println("Enter a valid number! ");
		
		else {
			
			int lastDigit = number%10;
			number = number/10;
			int thirdDigit = number%10;
			number /= 10;
			int secondDigit = number%10;
			int firstdigit = number/10;
			
			String[] singleDigits = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen",
										"Sixteen", "Seventeen", "Nineteen"};
			
			String[] doubleDigits = {"", "Ten", "Twenty", "Thirty", "Fourty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };
			
			String[] Digits = {"", "Hundred", "Thousand", "Lakh", "Million", "Crore"};
			
			
		
			
			if(firstdigit>0 && secondDigit > 0) {	
			
			 s1 = singleDigits[firstdigit]+ " "+
									Digits[2]+ " "+
					singleDigits[secondDigit]+ " "+
									Digits[1]+ " and ";
			 
			}
			
			if(firstdigit==0 && secondDigit>0) {
				
				s1 = singleDigits[secondDigit]+ " "+
						Digits[1]+ " and ";
			}
			
			if(firstdigit==0 && secondDigit==0) {
				
				s1 = "";
				if(thirdDigit<2) {
				
					int lastTwo = Integer.valueOf(String.valueOf(thirdDigit)+String.valueOf(lastDigit));
				
					s2 = singleDigits[lastTwo];
				}else {
			
					s2 = doubleDigits[thirdDigit]+" "+singleDigits[lastDigit];
				}
			}
		else {
			
			if(thirdDigit<2) {
				
				int lastTwo = Integer.valueOf(String.valueOf(thirdDigit)+String.valueOf(lastDigit));
			
				s2 = singleDigits[lastTwo];
			}else {
		
				s2 = doubleDigits[thirdDigit]+" "+singleDigits[lastDigit];
			}
		}
		
		System.out.println(s1+s2);
	}
	
}
}