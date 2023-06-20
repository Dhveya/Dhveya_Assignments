package week1.day2;
//Note : whereever we are giving if only condition ll be given

public class LearnIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0; 
		int number=500;
		if (num > 5) 
		{
		System.out.println("PositiveNumber");
		} else if(num==0) {
			System.out.println("Neutral");
		}	//Note only one close braces even after including else if syntax	
		else //else part always last
		{
		System.out.println("Negative Number");
		}
        if (number>700)
        {
        	System.out.println("Mark1");
        }
        else if (number>=500)
        {
        	System.out.println("Mark2"); //number=500 then first condition result ll be printed
        }
        else if (number==500)
        {
        	System.out.println("Mark2.1");
        }
        else
        {
        	System.out.println("Fail");
        }
}
}