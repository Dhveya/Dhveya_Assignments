package week2.day3_ASSIGNMENT4_OVERLOADING;

public class Students {

	public static void main(String[] args) {
		Students S = new Students();
		S.getStudentInfo(2);
		S.getStudentInfo("ABC@gmail.com", "9807654321");
		S.getStudentInfo(5, "PinkyPattu");

	}

		public static void getStudentInfo(int id) {
			System.out.println("GetStudent ID");
		}
		
		public void getStudentInfo(int id,String name) {
			System.out.println("GetStudent ID and NAme");
			//getStudentInfo(4,"Pinky");
		}
		
		public void getStudentInfo(String Email,String PhoneNum) {
			System.out.println("GetStudent Email and Phone Number");
			//getStudentInfo("","");
		}
}
