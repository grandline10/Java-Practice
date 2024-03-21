package set1;

public class MinAndMax {

	public static void main(String[] args) {
		
		int[] a = {14,15,18,75,136,12,54,100,200};
		
		System.out.println(getMinAndMax(a));
	}
	
	static String getMinAndMax(int[] arr) {
		
		int min= Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for(int i=0; i< arr.length;i++) {
			
			if(arr[i]>max) max = arr[i];
			if(arr[i]<min) min = arr[i];
			
			
		}
		
		String mn = String.valueOf(min);
		String mx = String.valueOf(max);
		
		return "Min value is: " + mn +" and Max value is: " + mx;
	}
}
