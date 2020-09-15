package Prgs3;
import java.util.*;
public class Strong {
	public static void main(String[] args) {
	Scanner obj = new Scanner(System.in);
	System.out.println("enter number :");
	int n = obj.nextInt(); // n= 145
	int temp = n; //temp =145
	int sum =0;
	// identify each digit
	while( n != 0) // 0 != 0 -> f
	{
		int rem = n%10; // rem = 1%10 = 1
		int fact = 1;		
		// each digit factorial
		for(int i=1; i<= rem ; i++) // 1 <= 1
		{
			fact = fact *i; // fact = 1
		}
		sum = sum + fact; // sum =144+1=145
		n = n/10; // n= 1/10 = 0		
	}
	if(sum == temp) // 145 == 145 -> t
	System.out.println(temp +" is a Strong Number");
	else
	System.out.println(temp+" is Not Strong Number");
	} }
