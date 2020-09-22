package Prgs5;
import java.util.*;
public class Unhappy {
	//count no of digits
		static int count(int n) // n=135
		{
			int c =0;
			while(n != 0)// 0 != 0 -> f 
			{
				c++; // c=3
				n=n/10; // n= 1/10=0			
			}
			return c; // c=3
		} // end of count method
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("enter number :");
	int num =sc.nextInt(); //num =135
	int n= num; // n= 135	
     int len= count(num); // len = 3
     int sum =0;
  // sum of digits powered with their pos
     while(num > 0) // 0 > 0 -> f
     {
    	 int rem = num%10; // rem = 1%10 = 1
    	 sum = sum + (int)Math.pow(rem, len); //sum=134+ 1 pow 1= 135
    	 num = num/10 ; // num = 1/10 = 0
    	 len--; // len=0
     }
	 if(sum == n)
	 System.out.println("Unhappy number");
	 else
		 System.out.println("Not Unhappy number");
	} // end of main method
} //end of class


