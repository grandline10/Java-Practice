package set1;

public class SecondHighest {

	public static void main(String[] args) {
		
		int[] a = {10,12,15,78,56,32,25};
		
		int result = secondHighestNumber(a);
		System.out.println(result);
	}
	
	static int secondHighestNumber(int[] arr) {
		
		int highest=Integer.MIN_VALUE;
		int secondHighest = Integer.MIN_VALUE;
		
		for(int i=0; i<arr.length;i++) {
			
			if(arr[i]>highest) {
				
				secondHighest = highest;
				highest = arr[i];
			}
			else if(arr[i]<highest && arr[i]> secondHighest) secondHighest=arr[i];
		}
		
		return secondHighest;
	}

}
