package week3_day1;

public class Learn_Constructor_Default {
	
	int x; //Default int value = o
	String name; //Default String value = Null
		//Constructor
		//note: dont use return stmn (like void) if u insert void ll throw an error
		public  Learn_Constructor_Default() {
			
	System.out.println("c");
		}
	public void add() {
		System.out.println("add");
	}
	public static void main(String[] args) {
		Learn_Constructor_Default lc = new Learn_Constructor_Default();  //ctrl 2 l //new keyword - 
		//no need to call with obj name
		
	System.out.println("Default Values"+lc.x);
	System.out.println("Default Values"+lc.name);
	}

	}


