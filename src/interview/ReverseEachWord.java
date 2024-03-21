package interview;

public class ReverseEachWord {
	
	public static void main(String[] args) {
		
		String s = "Testing using restAssured library";
		
		String[] array = s.split(" ");
		
		StringBuilder sb = new StringBuilder();
		
		for(String a: array) {
			
			for(int i=a.length()-1; i>=0; i--) {
				
				sb.append(a.charAt(i));
			}
			
			sb.append(" ");
		}
		
		System.out.print(sb);
	
		
		
	}

}
