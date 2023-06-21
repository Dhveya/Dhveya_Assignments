package week1.day3; 

public class ASSIGNMENT4_Reverse_Even_Position {
    	   public void reverseWordInMyString(String str)
    	   {
    		/* The split() method of String class splits
    		 * a string in several strings based on the
    		 * delimiter passed as an argument to it
    		 */
    		String[] words = str.split(" ");
    		String reversedString = "";
    		for (int i = 0; i < words.length; i++)
    	        {
    	           String word = words[i]; 
    	           String reverseWord = "";
    	           for (int j = word.length()-1; j >= 0; j--) 
    		   {
    			/* The charAt() function returns the character
    			 * at the given position in a string
    			 */
    			reverseWord = reverseWord + word.charAt(j);
    		   }
    		   reversedString = reversedString + reverseWord + " ";
    		}
    		System.out.println(str);
    		System.out.println(reversedString);
    	   }
    	   public static void main(String[] args) 
    	   {
    		ASSIGNMENT4_Reverse_Even_Position obj = new ASSIGNMENT4_Reverse_Even_Position();
    		obj.reverseWordInMyString("I am a software tester");
    	   }

}

      /*String val = "";
        String val1="";
        String value="";
        String test="I am a software tester";
        String[] t = test.split(" ");
        System.out.println (Arrays.toString(t));
        int arr= t.length;
        System.out.println (arr);
        for (int i=0; i<t.length;i += 2)
        {
            for (int j=1; j<t.length;j += 2)

            {
                val1=(t[j]);
                value  =new StringBuilder(val1).reverse().toString();

                System.out.print ("*"+value);   
             }
            val=t[i];
            String Test =val;
            System.out.print (","+Test);
            }*/
/* 	StringBuilder result = new StringBuilder();
        for( int i = 0; i < t.length; i += 1 )
        {
            if( i % 2 != 0 )
            {
                char[] word = t[i].toCharArray();
                String reverseWord = "";
                for( int k = word.length; k > 0; k-- )
                {
                    reverseWord += String.valueOf( word[k-1] );
                }
                result.append( reverseWord ).append( " " );
            }
            else
            {
                result.append( t[i] ).append( " " );
            }
        }
        System.out.println( result.toString() );*/