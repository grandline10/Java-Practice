package interview;

import java.util.HashMap;

public class ConnectArrays {

	public static void main(String[] args) {
		
		//output should be: {1=apple, 2=orange, 3=banana, 4=grapes, 5=pumpkin}
		
		String[] fruits = {"apple","orange","banana","grapes","pumpkin"};
		
		int[] numbers = {1,2,3,4,5};
		
		int i=0;
		
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		
		if(numbers.length==fruits.length) {
			
			for(String a: fruits) {
				
				map.put(numbers[i], a);
				i++;
			}
		}
		
		System.out.println(map);
	}
}
