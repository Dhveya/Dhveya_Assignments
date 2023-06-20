package week1.day2;

public class LearnMethodWithDataType {

	public int add(int a,int b) {
		return a+b;
	}
	public int sub(int a,int b) {
		return a-b;
	}
	public static void main(String[] args) {
		LearnMethodWithDataType obj = new LearnMethodWithDataType();
	
		//obj.add1(2, 4) wont work
		//have to give within syso
		System.out.println(obj.sub(5, 0));
		//OR
		//store it in local variable >> ctrl+2 ,L
		int add1 = obj.add(2, 4); //add1 - local variable
		int sub1 = obj.sub(5, 7); //sub1 - local variable
		System.out.println(add1);
		System.out.println(sub1);
		
	}
}
