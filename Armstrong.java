package Prgs4;
import java.util.*;
public class Armstrong {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter number :");
	int n = sc.nextInt(); // n = 153
	
	int d=0 , sum=0, temp = n; // temp = 153
	
	//count of digits
	while(n>0) // 0>0 -> f
	{
		int rem = n%10;// rem = 1%10 = 1
				d++; // d = 3
		n=n/10; // n = 1/10 = 0
	}
	n= temp; // n=153
	//sum of power of digits
	while(n>0) // 0 > 0 -> f
	{
		int rem = n%10; // rem = 1%10 = 1
		sum = sum + (int)Math.pow(rem,d); // sum =152+ 1 pow 3 = 153
		n=n/10; //n= 1/10 = 0
	}
	if (temp == sum)
		System.out.println("Armstrong Number");
	else
		System.out.println("Not Armstrong Number");
	}}
