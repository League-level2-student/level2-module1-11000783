package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> names = new ArrayList<String>();
		//2. Add five Strings to your list
		names.add("jabe");
		names.add("turtle");
		names.add("calab");
		names.add("earl");
		names.add("shiddi");
		
		//3. Print all the Strings using a standard for-loop
/*		for (int i = 0; i < names.size(); i++) {
			String s = names.get(i);
			System.out.println(s);
		}
		//4. Print all the Strings using a for-each loop
		for(String s : names) {
		System.out.println(s);
		} 
		//5. Print only the even numbered elements in the list.
		for (int i = 0; i < names.size(); i+=2) {
			String s = names.get(i);
			System.out.println(s);
		} 
		//6. Print all the Strings in reverse order.
		for (int i = names.size() -1; i >= 0; i--) {
			String s = names.get(i);
			System.out.println(s);
		}
		*/
		//7. Print only the Strings that have the letter 'e' in them.
		for(String s : names) {
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'e') {
				System.out.println(s);
			}
		}
			
			} 

	}
}
