package interview2;



public class PyramidPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PyramidPattern patt = new PyramidPattern();
		
		int height = 5;
		
		patt.normalPyramid(height);
	}

	
	public void normalPyramid(int height) {
		
		/*
		 * 			*
		 * 		   * *
		 *        * * *
		 *       * * * *     
		 */
		
		for(int i=0; i<height; i++) {
			
			for(int j=0; j<height-i+1; j++) {
				System.out.print(" ");
			}
			
			for(int k=i+1; k>0; k--) {
				System.out.print("* ");
			}
			
			System.out.println("");
		}
	}
}
