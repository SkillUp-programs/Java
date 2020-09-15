package Prgs3;
import java.util.*;
public class SPY {
	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("enter number :");
	int n= sc.nextInt(); // n = 132
	int num = n; // num 132
	int sum=0, mul=1;
	while(num>0) // 0 > 0 -> f
	{
		int rem = num%10; // rem = 1%10 = 1
		sum = sum + rem; // sum = 5+1 = 6
		mul = mul * rem; // sum = 6*1 = 6 
		num = num/10 ; //num = 1/10 = 0
	}
if(sum == mul) // 6==6 -> t
	System.out.println(n+" is SPY Number");
else
	System.out.println(n+" is Not SPY Number");
	} }
