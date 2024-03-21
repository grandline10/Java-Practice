package interview;

import java.util.Scanner;

public class SwapWithoutThird {

	public static void main(String[] args) {
		
		System.out.print("Give me values for x : ");
		Scanner s = new Scanner(System.in);
		
		int x = s.nextInt();
		
		System.out.print("Give me values for y : ");
		int y = s.nextInt();
		
		x = x+y; //assign sum of both to the x
		y = x-y; //now remove y from the sum which in turn gives us the earlier value of x
		x = x-y; //Now remove y from the sum once again but this time the updated value of y is x from the previous statement
				 //Hence it will give us the original y value or amount which will be assigned to the x.
		
		System.out.println("After swapping Value of x: "+ x +" and value of y: "+ y);
		
		
	}
}
