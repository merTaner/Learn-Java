package stringsDemo;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		// find string in known position with charat()
		String message = "this is a string message";
		System.out.println(message.charAt(3));
	/*
		// .startWith() - .endWith()
		System.out.println(message.startsWith("t"));
		
		// .getChars() parameter given index get char and then return a list
		
		// .indexOf('') return index to given char
		
		// replace change old message to new message 
		System.out.println(message);
		System.out.println(message.replace(' ', '*'));
	*/
		
		// .substring() find to string known range for
		System.out.println(message.substring(3));
		
		// split cut element by element
		for (String word : message.split(" ")) {
			System.out.println(word);
		}
		
		// trim() delete to space	
		
	}

}
