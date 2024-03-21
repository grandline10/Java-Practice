 package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Arraylist {
	
	//Create a method which takes a list of strings as a parameter and by using iterator 
	//print all one by one
	public static void main(String[] args) {
		
		List<String> ls = new ArrayList<String>();
		ls.add("one");
		ls.add("two");
		ls.add("three");
		ls.add("four");
		
		getElements(ls);  
		
	}

	static void getElements(List<String> list) {
		
		Iterator iterator = list.iterator();
		
		while(iterator.hasNext()) {
			
			System.out.println(iterator.next());
		}
		
	}
}
