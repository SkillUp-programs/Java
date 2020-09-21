package Prgs4;
import java.util.*;
public class Neon {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter number :");
	int n = sc.nextInt(); // n=9
	
	int sq = n*n; // sq = 9*9 = 81
	
	int sum=0;
	
	while(sq>0)  // 0 >0 -> f
	{
		int rem = sq%10; // rem = 8%10 = 8
		sum = sum + rem ; // sum=1+8 = 9
		sq=sq/10; // sq=8/10 =0				
	}
	if( sum == n)
		System.out.println("Neon Number");
	else
		System.out.println("Not Neon Number");
	} }
