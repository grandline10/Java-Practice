package interview;

public class NoramlPyramid {

	public static void main(String[] args) {
		
		//following code can be modified according to our requirements to print any type of star patterns.
		
		int count = 10;
		for(int i=1; i<=count ; i++) {
			
			for(int j=count-i; j>0; j--) {
				System.out.print(" ");
			}
			
			for(int k=i; k>0; k--) {
				
				System.out.print("* ");
			}
			
			System.out.println("");
		}
	}
}


