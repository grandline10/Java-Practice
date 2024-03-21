package interview;

import java.util.Arrays;
import java.util.List;

public class Java8Features {
	
	public static void main(String[] args) {
		
		testFunction();
		
	}
	
	
	
	//program to remove duplicates from the list.
	static void testFunction() {
		
		
		int[] arr = {1,2,9,3,6,5,12,25,12,5,5,2,15};
		
		List<Integer> list = Arrays.asList(1,2,9,3,6,5,12,25,12,5,5,2,15);
		
		List<Integer> unique = list.stream().distinct().toList();
		
		System.out.println(unique);
	}

}
