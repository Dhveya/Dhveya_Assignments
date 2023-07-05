package week3_day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class Classroom1_Set_RemoveStringDuplicates {

			public static void main(String[] args) {
				
				String data="Google";
				String output = "";//if not giving ll print as single charaacters in console
				char[] ch = data.toCharArray();
				Set<Character> name = new LinkedHashSet<Character>();
				for(Character i : ch) {
					
					if(!name.add(i)) {
						output+=i;
					}
				}
				System.out.println("Removed Duplicated Charater from the given String is : "+name);
			System.out.println("Duplicate Char Found is : "+output);
			

	}

}
