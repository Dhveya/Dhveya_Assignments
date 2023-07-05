package week3_day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class ASSIGNMENT2_PrintUniqueCharacter {

	public static void main(String[] args) {
		String data="PINKY_PATTU";
		String output = "";//if not giving ll print as single characters in console
		char[] ch = data.toCharArray();
		Set<Character> unique = new LinkedHashSet<Character>();
		for(Character i : ch) {
			
			if(!unique.add(i)) {
				output+=i;
			}}
		System.out.println("Removed Duplicated Charater from the given String is : "+unique);
//	System.out.println("Duplicate Char Found is : "+output);

	}
	}


