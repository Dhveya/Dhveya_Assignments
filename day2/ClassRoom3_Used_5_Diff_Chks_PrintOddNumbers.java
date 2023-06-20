package week1.day2;

//import java.util.Iterator;

public class ClassRoom3_Used_5_Diff_Chks_PrintOddNumbers {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Method : 1
		int num=30;
		System.out.println("****************** ODD Nos : Method 1**************************************");
		for (int i = 0 ; i < num ; i++) {
		if (i%2!=0) {
			System.out.print("\t"+i);
			}
		}
		System.out.println("\n");
//Method 2
		int numb=30;
		System.out.println("\n"+"****************** ODD Nos : Method 2 - Diff Condition ****************");
		for (int l = 0 ; l <= numb ; l++) {
		if (l%2==1) {
			System.out.print("\t"+l);
			}
		}
		System.out.println("\n");
	
// Method : 3 (Descending Order without array concept)
		int num2=0;
		System.out.println("\n"+"****************** ODD NOs IN DESCENDING ORDER : Method 3 *************");
		for (int j = 30; j >= num2 ; j--) {
			if (j%2==1) {
				System.out.print("\t"+j);
			}
		}
		System.out.println("\n");
//Method : 4 (Using Break Stmnt)
		int num3 = 30;
		System.out.println("\n"+"****************** ODD Numbers USING BREAK STATEMENT : Method 4 ********");
		for (int k = 0; k < num3; k++) {
			if (k%2==1) {
				if(k==21) {
					System.out.println("\n"+"\t"+"21 wants a break and dont want to reach till cond.30 :)");
					break;
				}
				System.out.print("\t"+k);
			}
		}
		System.out.println("\n");
		
//Method : 5 (Using Continue Stmnt)
		int num6=30;
		System.out.println("\n"+"****************** ODD Numbers USING BREAK STATEMENT : Method 5 ********");
		for(int p=0; p<num6; p++) {
			if (p%2!=0) {		
				if (p==27) {
					continue;
					}
				
				System.out.print("\t"+p);
		}}
		
	}
}


