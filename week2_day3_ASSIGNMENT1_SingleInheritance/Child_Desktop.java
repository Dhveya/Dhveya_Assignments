package week2_day3_ASSIGNMENT1_SingleInheritance;

public class Child_Desktop extends Parent_Computer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child_Desktop obj = new Child_Desktop();
		obj.computerModel();
		obj.desktopSize();
	}

	private static void desktopSize() {
		// TODO Auto-generated method stub
		System.out.println("I am from child class - desktop");
		
	}

}
