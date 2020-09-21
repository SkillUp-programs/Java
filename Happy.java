package Prgs5;
import java.util.*;
public class Happy {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter number :");	
	Happy obj = new Happy(); // object creation(instantaition)	
	int num = sc.nextInt(); // num =32
	int result = num; // result = 32	
	while(result != 1 && result != 4) // 1 != 1 && 1 != 4 -> f
	{
		result = obj.print(result);  // result = 1
	}
	if(result == 1)
	System.out.println("Happy Number");
	else
	System.out.println("Not Happy Number");
	}	
	int print(int num) // non-static method
	{
		int sum =0;
		
		while(num >0 ) // 0>0 -> t
		{
			int rem = num%10; // rem = 3%10 =3
			sum = sum +(rem * rem); // sum = 4+9= 13
			num = num/10; // 3/10 =0 					
		}
		return sum; // sum 13
	} }