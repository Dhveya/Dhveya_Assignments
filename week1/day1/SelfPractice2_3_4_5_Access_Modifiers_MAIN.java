package week1.day1;

public class SelfPractice2_3_4_5_Access_Modifiers_MAIN {
	
		public static void main(String[] args) {
			
		/* DEFAULT - AM  */ //Blue Triangle
		SelfPractice2_Default_Access DAM = new SelfPractice2_Default_Access();
		System.out.println(DAM.hours);
		System.out.println(DAM.mins);
		
		/* PUBLIC - AM  */ //Green circle
		SelfPractice5_Public_Access PUAM = new SelfPractice5_Public_Access();
		System.out.println(PUAM.hours);
		System.out.println(PUAM.mins);
		
		/* PROTECTED - AM */
		SelfPractice4_Protected_Access ProAM = new SelfPractice4_Protected_Access();
		System.out.println(ProAM.hours);
		System.out.println(ProAM.mins);
		
		/* Private-AM Chk*/
		
		//SelfPractice3_Private_Access PriAM = new SelfPractice3_Private_Access();
		//System.out.println(PriAM.hours);
		//System.out.println(PriAM.mins);
		
		}
	
		
}
