package week2_day3_ASSIGNMENT2_OVERRIDING;

public class BankInfo extends AxisBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankInfo obj = new BankInfo();
		obj.deposit();
	}
	public void deposit() {
		System.out.println("Same - Method : Same Type : Diff - Class : I WILL BE ONLY PRINTED");
	}
}
