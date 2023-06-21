package week1.day3;

import java.util.*;

//METHOD 1

public class ClassRoom1_DuplicateNos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums= {2,5,7,7,5,9,2,3};
		 Arrays.sort(nums);
		 for (int i = 0; i < nums.length-1; i++) {
			if(nums[i]==nums[i+1]) {
				System.out.println("Duplicates: "+nums[i]);
			}
		 }
		 
//METHOD 2
		 
		 int[] num= {2,5,7,7,5,9,2,3};
			//duplicate
			//compare the values : for & if 
			
			//NESTED FOR LOOP
			for (int i = 0; i < num.length; i++) {
				for (int j = i+1; j < num.length; j++) {
					if(num[i]==num[j]) {
						System.out.println("Duplicate Value Method2:"+num[j]);
					}
				}
			}
	}
}
