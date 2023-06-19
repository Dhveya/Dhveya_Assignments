package week1.day1;

public class SelfPractice3_Private_Access {
	
		// PRIVATE: Can be accessed within class only - can extend in another package (which ll be considered as sub class))
		// Should mention infront
				private int hours = 3;
				private int mins = 45;
				
				public static void main(String[] args) {
					SelfPractice3_Private_Access Pri = new SelfPractice3_Private_Access();
					System.out.println(Pri.hours);
					System.out.println(Pri.mins);
				}
}
