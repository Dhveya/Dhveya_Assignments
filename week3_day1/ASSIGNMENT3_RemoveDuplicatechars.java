package week3_day1;

import java.util.HashSet;
import java.util.Set;

public class ASSIGNMENT3_RemoveDuplicatechars {

	public static void main(String[] args) {
			{
			String string= "PayPal India";
			String output="";
			char[] ch = string.toCharArray();//converting to char

			Set<Character> charSet=new HashSet<Character>();
			Set<Character> dupCharSet=new HashSet<Character>();
			
			for (Character i : ch) 
			{
				if (charSet.add(i)) 
				{
					output=output+i;
					}
				
			else
			{
				dupCharSet.add(i);
			}
			}
			System.out.println("Removed Duplicate Character from String is: " +output);
		}

	}

}
