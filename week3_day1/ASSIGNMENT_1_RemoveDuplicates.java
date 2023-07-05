package week3_day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class ASSIGNMENT_1_RemoveDuplicates {

	public static void main(String[] args) {
		int[] data = {4,3,6,8,29,1,2,4,7,8};
		
		Set<Integer> unq = new LinkedHashSet<Integer>();
		Set<Integer> dup = new LinkedHashSet<Integer>();
		
		for (int i=0 ; i<data.length;i++) {
			boolean add = unq.add(data[i]);
			if(!add) {
				dup.add(data[i]);
			}
		}
		System.out.println("Expected Output: Duplicate Numbers are : " +dup);

		/*
		 * Problem Statement : Print only duplicate values
		 * Expected output: 4 and 8
		 * 
		 * How to solve?
		 * 1) Regular for loop
		 * 2) Using Set
		 * 
		 * Using Set 
		 * 
		 * a) Add every element into Set
		 * b) If it is already there in the Set -> Print duplicate
		 * 
		 */

	}

}
