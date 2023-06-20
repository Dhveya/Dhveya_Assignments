package week1.day2;

public class ClassRoom2_IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mark=360;
		if (mark>400)
		{
			System.out.println("PASS : Grade 1 with mark = " +mark);
		}
		else if(mark>320)
		{
			System.out.println("PASS: Grade 2 with mark = " +mark);
		}
		else
		{
			System.out.println("FAIL with mark = "+mark);
		}
	}

}
