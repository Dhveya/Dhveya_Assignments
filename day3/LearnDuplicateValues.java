package week1.day3;

import java.util.concurrent.ForkJoinPool;

public class LearnDuplicateValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num= {2,5,7,5,8,3,9,3,1,5};
		//duplicate
		//compare the values : for & if 
		
		//NESTED FOR LOOP
		for (int i = 0; i < num.length; i++) {
			for (int j = i+1; j < num.length; j++) {
				if(num[i]==num[j]) {
					System.out.println("Duplicate Value:"+num[j]);
				}
			}
		}

	
	//Method 2
	
	int[] data= {4,5,6,7,4,3,2,6,3};
	 Arrays.sort(data);
	 for (int i = 0; i < data.length; i++) {
		if(data[i]==data[i+1]) {
			System.out.println(data[i+1]);
		}
	}
 

}
