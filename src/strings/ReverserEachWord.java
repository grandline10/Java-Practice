package strings;

public class ReverserEachWord {

	public static void main(String[] args) {
		
		String s = "Reverse each word of the sentence.";
		reverse(s);
		
	}
	
	static void reverse(String s) {
		
		String[] arr = s.split(" ");
		
		for(String a: arr) {
			
			for(int i=a.length()-1; i>=0; i--) {
				
				System.out.print(a.charAt(i));
				
			}
			
			System.out.print(" ");
		}
		
	
	}
}
