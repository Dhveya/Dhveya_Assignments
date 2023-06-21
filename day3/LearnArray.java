package week1.day3;

import java.util.Arrays;

public class LearnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//METHOD 1 
		//Syntax
		int[] marks= {24,34,45,34,22,45};
		
		//index starts with 0
		//local - ctrl+2-1
		int length = marks.length;
		System.out.println("Array Length:"+ length);
		
		//print first mark
		System.out.println("First Mark:"+ marks[0]);
		
		//print last mark(6-1=5)marks[5]
		System.out.println("After sorting last mark:" +marks[length-1]);
		
		//sorts
		Arrays.sort(marks);
		//Default : Ascending
		System.out.println(marks[length-1]);
		
		for( int i=0; i < length; i++) {
			System.out.println(marks[i]);
		}
	}

}
