package week3_day1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LearnSet {

	public static void main(String[] args) {

		int[] num = {2,6,3,9,3,1,5,2,6,8};
		//Set<Integer> data = new HashSet<Integer>();
		Set<Integer> data = new LinkedHashSet<Integer>();
		
		for (int i=0 ; i<num.length;i++) {
			data.add(num[i]);
		}
		System.out.println(data);

	}

}
