package interview;

public class HollowPyramid {
	
	public static void main(String[] args) {
		
		int count= 5;
		
		for(int i=1; i<=count; i++) { //to select number of rows in the matrix
			
			for(int j=count-i; j>0;j--) {//to select what to print at the start of each row
				
				System.out.print(" ");
				
			}
			
			for(int j=1; j<=2*i-1;j++) {//loop to choose what to print after the above for loop i.e after printing spaces
				if(j==1 || j== 2*i-1 || i==count) {
					
					System.out.print("*");
				}else System.out.print(" ");
				
				
			}
			System.out.println("");//to change the line after printing each row
			}
		
	}

}
