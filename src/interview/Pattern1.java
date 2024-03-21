package interview;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {

		// pattern is half pyramid on the right side
		// This same program can be modified in a very small way to print the desired
		// pattern.
		
		/*
		 * Steps to follow:
		 * 1. Outermost for loop is for the number of rowCount in the pattern i.e the matrix
		 * 2. Now identify for every row number how many columns are there and type of element in those columns.
		 * 3. What do you need to print.
		 * 4. Try to come up with the formula which creates a relation between rowCount and columns. It will make it easy to print desired elements in each row.
		 */

		System.out.print("Enter the length of the base of the pyramid: ");
		Scanner s = new Scanner(System.in);

		int count = s.nextInt();
		
//		pyramid(count);
		
//		pattern2(count);
		
//		pattern3(count);
		
//		pattern4(count);
		
		pattern5(count);

	}

	
	
	
	
	
	
	
//	    *
//	   * * 
//	  * * * 
//	 * * * * 
//	* * * * *
	static void pyramid(int rowCount) {
		
//		     
		

		for (int i = 1; i <= rowCount; i++) {

			for (int j = rowCount - i; j > 0; j--) {

				System.out.print(" ");
			}

			for (int k = i; k >= 1; k--) {

				System.out.print("* ");
			}

			System.out.println("");
		}
		
	}
	
	

//	* * * * * 
//	* * * * 
//	* * * 
//	* * 
//	* 
	
	static void pattern2(int rowCount) {
		
		
		for(int i=1; i<=rowCount; i++) {
			
			for(int j=rowCount-i+1; j>=1; j--) {
				
				System.out.print("* ");
			}
			
			System.out.println();
		}
	}

	
//	1 
//	1 2 
//	1 2 3 
//	1 2 3 4 
//	1 2 3 4 5 
	static void pattern3(int rowCount) {
		
		for(int i=1; i<=rowCount; i++) {
			
			for(int j=1; j<=i; j++) {
				
				System.out.print(j+" ");
			}
			
			System.out.println();
		}
	}
	
	
//	* 
//	* * 
//	* * * 
//	* * * * 
//	* * * * * 
//	* * * * 
//	* * * 
//	* * 
//	* 
	static void pattern4(int n) {
		int k=1;
		for(int i=1; i<=2*n-1; i++) {
			
			//Instead of using two blocks of if and else we can also use Ternary operator with some conditions shown as follows
			
			//int totalColumnsInRow = i>n ? 2*n -i : i; 
			//for(int j=0; j< totalColumnInRow ; j++){
//			System.out.print("* ");
			
//		}
			
			if(i<=n) {
				
				for(int j=i;j>0;j--) {
					System.out.print("* ");
				}
				System.out.println();
			}else {
				
				for(int j=n-k;j>0;j--) {
					System.out.print("* ");
				}
				k++;
				System.out.println();
			}
		}
	}
	
	
//	    * 
//	   * * 
//	  * * * 
//	 * * * * 
//	* * * * * 
//	 * * * * 
//	  * * * 
//	   * * 
//	    * 
	static void pattern5(int n) {
		
		for(int rowCount=1; rowCount<= 2*n-1; rowCount++) {
			
			int totalColumnsInRow = rowCount>n ? 2*n - rowCount: rowCount;
			
			int numberOfSpaces = n-totalColumnsInRow;
			
			for(int space=1; space<=numberOfSpaces; space++) {
				
				System.out.print(" ");
			}
			
			for(int col=1; col<= totalColumnsInRow; col++) {
				
				System.out.print("* ");
			}
			
			System.out.println();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
