package week1.day3;

public class ClassRoom2_ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//Method 1
		String str="Amazon", nstr=" ";
		char ch;
		System.out.println("Original Word");
		System.out.println("Amazon");
	
	for (int i = 0; i < str.length(); i++) {
		ch=str.charAt(i);
		nstr=ch+nstr;
	}
	System.out.println("Reverse Word: "+nstr);
	
	//Method 2
	
	String s="AMAZON";
	char[] charArray=s.toCharArray();
		for (int i = charArray.length-1; i >=0; i--) {
			System.out.println(charArray[i]);
		}	
	}
}
