package interview;

public class ReverseStringWithSpecialCharacters {
	public static void main(String[] args) {
        String s = "alphabetical1234@#;ajkio";
        
        //call the method which is mentioned below.
        reverse(s);

		
	}
	

    static void reverse(String s){
    	
    	/*
    	 * APPROACH: We are going to solve this by using two pointers : one at the starting character of the string
    	 * which we'll be going to convert into the character array. And another pointer is pointing at the last character
    	 * of the string. 
    	 * We'll be moving towards the center and at the same time switching both characters at both pointer positions.
    	 * And we will be doing that until both the pointers cross each other at the center i.e left becomes greater than 
    	 * right pointer.
    	 */
        char[] arr = s.toCharArray();
        int left =0;
        int right = arr.length-1;

        while(left<right){
        	
        	//check if the character at the left pointer is special character or not. And if it is a special character then
        	//increment the left pointer without switching with the character at the right pointer position
            if(!Character.isAlphabetic(arr[left])){
                left++;
                
            //same as above for the right pointer.    
            }else if(!Character.isAlphabetic(arr[right])){

                right--;
                
            //when both the characters are not special characters, then switch those characters with each other.
            }else{

                char temp = arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }
        }
        
        //following statement converts the array of characters into a string.
        //NOte: this works only with the array of characters and not of other datatypes.
        String revesedString = new String(arr);

        System.out.println("Reversed string is: "+ revesedString);


    }
}
