package week3_day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class LearnSet_ProntDuplicateToo {

	public static void main(String[] args) {
		int[] num = {5,6,2,4,1,7,9,8,2,4};
		/* create 2 empty set
		 */
		Set<Integer> unq = new LinkedHashSet<Integer>();
		Set<Integer> dup = new LinkedHashSet<Integer>();
		
		for (int i=0 ; i<num.length;i++) {
			boolean add = unq.add(num[i]);
			if(!add) {
				dup.add(num[i]);
			}
		}
		System.out.println(unq);
		System.out.println(dup);

	}

}
