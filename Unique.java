package Prgs3;
import java.util.*;
public class Unique {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter number :");
	int n= sc.nextInt(); // n= 12113
	int c, flag = 1; //unique
	int no = n; // no = 12113
	// checking 0-9 digits existing in a number
	for(int i = 0; i<= 9 ; i++) // i = 1..9
	{
		n=no;  // n=12113
		c=0;
		//checking each digit existing for how many times
		while(n>0) // 0>0 -> f
		{
			int d = n%10; //d = 1%10 = 1
			if(d==i) // 1 == 1
				c++; // c=3
			n= n/10; // n= 1/10 = 0
		}		// end of while loop
	if(c>1) // 3>1 , if a digit exits for multiple times, breaks for loop
	{
		flag =0; // not unique number
		break;		
	}		
	}// end of for loop
	
	if(flag ==1 )
	System.out.println("Unique Number");
	else
	System.out.println("Not Unique Number");
	}	}


