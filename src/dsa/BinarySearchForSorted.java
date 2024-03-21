package dsa;

public class BinarySearchForSorted {
	
	public static void main(String[] args) {
		int[] a = {14,15,18,75,100,136,200};
		
		int result =binarySearch(a, 100);
		System.out.println(result);

	}
	
	static int binarySearch(int[] arr, int target) {
		
		int start = 0;
		int end = arr.length-1;
		
		
		while(start<=end) {
			int mid = start + (end-start)/2;
			
			//condition that says the array is in ascending order
			if(arr[start]<arr[end]) {
				
				if(target<arr[mid]) {
					
					end = mid-1;
				}
				else if(target>arr[mid]) {
					start= mid+1;
				}
				else {
					
					return mid;
				}
					
			} 
			
			//condition says that the array is in decreasing order.
//			else if(arr[start]>arr[end]) {
//				
//				if(target>arr[mid]) {
//					
//					end = mid-1;
//				}
//				else if(target<arr[mid]) {
//					start= mid+1;
//				}
//				else return mid;
//			} 
			
		}
		return -1;
	}

}
