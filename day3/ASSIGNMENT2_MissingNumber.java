package week1.day3;
import java.util.*;  

public class ASSIGNMENT2_MissingNumber {

		//  public static int MissingNumber(int[] arr)
		  //  {
		    //    int n=arr.length;
		      //  int sum1=((n)*(n+1))/2;
		        //int sum2;
		        //for(int i=0;i<n;i++)
		          //sum2+=arr[i];
		        //return sum1-sum2;
		   // }
	

	/*Java Program to find the missing element*/
	
	//import java.util.Arrays; 

	  /* public static void main(String args[])   
	   {  
	       Scanner sc=new Scanner(System.in);

	      int n;    //Declare array size
	      System.out.println("Enter the total number of elements ");
	      n=sc.nextInt();     //Initialize array size

	      int arr[]=new int[n];   //Declare array
	      System.out.println("Enter the elements of the array ");
	      for(int i=0; i<n ;i++)     //Initialize array
	      {
	          arr[i]=sc.nextInt();
	      }
	      
	      int sum=(n+1)*(n+2)/2;   //Calculate the expected sum of all the elements from 1 to n
	      for(int i=0;i<n;i++)
	      {
	          sum=sum-arr[i]; //Subtract each element from the sum
	      }
	      System.out.println("Missing Element is "+sum);  //Print the missing element
	   }
	}
	*/
	
	//public static void main(String[] args)
		 // TODO Auto-generated method stub
		//    {
		  //      int[] arr = { 1, 2, 4, 5, 6 };
		    //    System.out.println(MissingNumber(arr));
		    //}
	    public static int getMissingNo(int a[], int n)
	    {
	        int i, total;
	     	total  = (n + 1) * (n + 2) / 2;
	     	for ( i = 0; i < n; i++) // loop through the array (start i from arr[0] till the length of the array)
	     	total -= a[i];
	     	return total;
	    }
	    public static void main(String[] args)
	    {
	      	int a[ ] = {1, 2, 3, 4, 7, 6, 8}; //input
	      	int miss = getMissingNo(a, 7);
	      	System.out.println("The number missing is :"+miss);
	    }
	}

