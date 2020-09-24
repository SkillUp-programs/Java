package Prgs5;
import java.util.*;
public class Duffinian {
	//sum of divisors
	static int sum_div(int n) // n=35
	{
		int div =0;
		for(int i=1; i<= Math.sqrt(n); i++) // i=1..5
		{
			if(n%i==0)// 35%5==0
				div = div+i+n/i; // div=36+5+7= 48
		}
		return div; //div =48
	}
	static int gcd(int n1,int n2) // n1 = 35, n2 =48
	{
		int gcd = 1;
		for(int i = 1; i <= n1 && i <= n2; i++  ) //i=1..35 ,36->f
		{
			if( n1%i == 0 && n2%i == 0)// 35%35==0 && 48%35==0  -> f
				gcd = i ; // gcd = 1			
		}
		return gcd; //gcd =1		
	}	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter number :");
	int a = sc.nextInt(); // a =35	
	int b= sum_div(a);  // b= 48
	System.out.println("sum of div = " + b);
	int hcf = gcd(a,b);
	System.out.println("GCD = "+hcf);
	if(hcf ==1)
		System.out.println("Duffinian Number");
	else
		System.out.println("Not Duffinian Number");
	} }
