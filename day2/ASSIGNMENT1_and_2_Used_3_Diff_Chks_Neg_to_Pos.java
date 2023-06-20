package week1.day2;

public class ASSIGNMENT1_and_2_Used_3_Diff_Chks_Neg_to_Pos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
//Method 1
		int num7=-40;
		if(num7<0)
		{
			num7=-(num7);
			System.out.println("Turned Positive No is : " + num7);
			
		}
			//System.out.println("Num = " + (-(num)));
//Method 2 - without if
	{
		int num = -40 ;
		num = -(num);
		System.out.println("Turned Positive No without if is : " + num);
	}
	
//Method 3 - using math.abs without if
	{
		int num = -40;
		num = Math.abs(-num);
		System.out.println("Turned Positive No. using abs. is : " + num);
	}
	}

	}
		
		

