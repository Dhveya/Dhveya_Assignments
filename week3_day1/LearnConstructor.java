package week3_day1;

public class LearnConstructor {

	//Constructor
	//note: dont use return stmn (like void) if u insert void ll throw an error
	public LearnConstructor() {
		
System.out.println("c");
	}
public void add() {
	System.out.println("add");
}
public static void main(String[] args) {
	LearnConstructor lc = new LearnConstructor();  //ctrl 2 l //new keyword - 
	//no need to call with obj name
	
	//everytime constructor ll be automatically called
	LearnConstructor lc1 = new LearnConstructor(); 
	
	lc.add();
}

}
