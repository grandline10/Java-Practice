package interview;

import java.util.HashMap;
import java.util.Map;

public class OccurancesInString {
	
	public static void main(String[] args) {
		
		//to count the occurance of each character in a given string, we can use map to keep track of character frequencies.
		String s = "java is the best programming language";
		
		Map<Character, Integer> map = new HashMap<>();
		
		for(Character c: s.toCharArray()) {
			
			if(c==' ') continue;
			
			map.put(c, map.getOrDefault(c, 0)+1);
			//map.getOrDefault() method returns associated value for the key c if the key is present in the map. Otherwise it will
			//return the default value which is provided by the user. Here default value provided by the user is Zero which is the 
			//second parameter.
			//i.e in the above put method what we are doing is first putting or creating a key value pair where we are fetching keys
			//from the character array created from the string and corresponding value is being is set by using anothe method shown
			//as above.
			//If the character occurs for the first time but there is no value associated with it in here , hence the method will
			//assign Zero to it by default and then add 1 since we want to count from 1. Further down the string if the same character
			//such as c then once again the method will check if the key is present in the map or not if the key is already present then
			//it will take the value of the key from the previous occurance. Here we previously gave it a value 0+1. Hence now the method will
			//give value equal to previous value and we are then adding 1 to it. Therefore it will become 2. Thus we are increasing the count
			//by one each of its occurance.
			
			//Now to display character and their occurances.
		}
			
		for(Map.Entry<Character, Integer> entry: map.entrySet()) {
				
				System.out.println(entry.getKey()+" : "+ entry.getValue());
				
				
		}
		
		
	}

}
