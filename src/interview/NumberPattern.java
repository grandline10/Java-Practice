package interview;

public class NumberPattern {
	
	public static void main(String[] args) {
		
		/*
		 * 1
		 * 2 6
		 * 3 7 10
		 * 4 8 11 13
		 * 5 9 12 14 15
		 */
		
		int rows = 5;
		int count =1;
		
		for(int i=1; i<=rows; i++) {
			
			for(int j=1; j<=rows-i; j++) {
				
				System.out.print(" ");
			}
			
			for(int j=1; j<=i; j++) {
				
				System.out.print(count+" ");
				count++;
			}
			
			System.out.println("");
		}
	
	}

}
