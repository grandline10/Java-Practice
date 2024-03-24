package interview;

public class PalindromeOfInteger {
	
	public static void main(String[] args) {
		
//		palindrome();
//		palindrome1();
		
		multiplyString();
	}
	
	
	static void palindrome() {
		
		int a = 12321;
		
		String s = String.valueOf(a);
		
		System.out.println();
		
		
		/*
		 * int Integer
		 * char Character
		 * boolean Boolean
		 * byte Byte
		 * double Double
		 * long Long
		 * float Float
		 * short Short
		 */
	}
	
	static void palindrome1() {
		
		int num = 12321;
		
		int reverse = 0;
		
		while(num>0) {
		reverse = reverse *10 + num % 10;
		num = num/10;
		
		/*
		 * 1 reverse = 1  num = 1232
		 * 2.reverse = 10 + 2 = 12  num = 123
		 * 3. reverse = 120 + 3 = 123 num = 12
		 * 4. reverse = 1230 + 2 = 1232 num = 1
		 * 5. reverse = 12320 +1 = 12321 num = 0
		 */
		
		
		}
		System.out.println(num==reverse);
		System.out.println(reverse);
		
	}
	
	
	static void multiplyString() {
		
		int a = 8;
		String s = "two";
		
		//output = 100
		
		String addition = s + a;
		
		System.out.println(addition);
		int b = Integer.parseInt(addition);
		System.out.println("result: " + b);
		
		
	}

}
