package Prgs5;
import java.util.*;
public class Abundant {
	
	static int Sum_Fac(int n) // n =12
	{
		int sum =0;
		for(int i =1; i <= (Math.sqrt(n)); i++) // 3 <= 3 -> t
		{
			if(n%i==0) // 12/3 == 0 -> t
			{
				sum=sum + i + n/i ;  // sum=21+3+(12/3)=28			
			}
		}
	// sum of proper factors
	sum = sum-n ; // sum = 28-12 = 16
	return sum; //sum = 16
    }
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter number :");
	int n= sc.nextInt(); // n=12
	if(Sum_Fac(n) > n) // 16>12 -> t
		System.out.println("Abundant number");
	else
		System.out.println("Not Abundant Number");
	} }
