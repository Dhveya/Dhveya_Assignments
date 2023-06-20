package week1.day2;

public class PrintEvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=20;
		//=
		//l==r
		for (int i = 0; i < num; i++) {
		if (i%2==0) {
			if (i==17) {
				//if we give i==18 and continue > 18 will not be printed
				break;
			}
			System.out.println("Even number is : " +i);
		}
		}
	}

}
