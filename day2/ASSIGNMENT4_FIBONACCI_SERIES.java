package week1.day2;

/* LEARNINGS!
1) Have recalled the functionality of Fibonacci :)
2) Have recalled the functionality of Fibonacci :)
3) Have recalled the functionality of Fibonacci :)
* Learning day by day from our team specially shortcuts while implementing my codes  
* Started THINKING BY OWN FOR CODING though confirmed with google - Thanks!
* KIND NOTE : On following exactly with the given condition the program fails* 
*/

public class ASSIGNMENT4_FIBONACCI_SERIES {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=0,num2=1,num3;
		int range=8;
		System.out.print(num1+ ", " + num2 +" ");
		//for (int i=2; i<range ; i++) {
		for(int i=2; i<range ; ++i){
			num3=num1+num2;
			System.out.print(", " +num3 + " ");
			num1=num2;
			num2=num3;
			//System.out.println(num3);
		}

	}

}
