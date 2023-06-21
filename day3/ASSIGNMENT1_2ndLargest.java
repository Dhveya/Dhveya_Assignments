package week1.day3;

import java.util.Arrays;

public class ASSIGNMENT1_2ndLargest {

		public static int getSecondLargest(int[] a,int total) {
			Arrays.sort(a);
			return a[total-2];
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {3,2,11,4,6,7};
			System.out.println("Second Largest : " + getSecondLargest(a,6));
			
	}

}
