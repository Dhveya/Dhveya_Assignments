package week3_day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class LearnSetStringTochar {

	public static void main(String[] args) {
		/*String data="TestLeaf";
		String output = "";//if not giving ll print as single charaacters in console
		char[] ch = data.toCharArray();
		
		//set
		Set<Character> name = new LinkedHashSet<Character>();
		//Character - should be in full form
		for(int i=0; i<ch.length;i++) {
		
			name.add(ch[i]);
			output+=name;
		}
	System.out.println(output);
	System.out.println(name); */
		
		String data="TestLeaf";
		String output = "";//if not giving ll print as single charaacters in console
		char[] ch = data.toCharArray();
		Set<Character> name = new LinkedHashSet<Character>();
		for(Character i : ch) {
			
			if(!name.add(i)) {
				output+=i;
			}
		}
	System.out.println(output);
	System.out.println(name);
	}

}
