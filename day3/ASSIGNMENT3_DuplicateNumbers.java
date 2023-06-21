package week1.day3;

public class ASSIGNMENT3_DuplicateNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				int[] arr= {14,12,13,11,15,14,18,16,17,19,18,17,20};
				//compare values use for loop
				System.out.println("Duplicate Values");
		for (int i=0;i<arr.length;i++) {
			
			for (int j=i+1;j<arr.length;j++) {
				//compare values
				if(arr[i]==arr[j]) {
						System.out.println(arr[j]);
							//break;
							
				}
			}
		}

			
	}

}
