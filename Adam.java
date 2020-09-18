package Prgs4;
import java.util.*;
public class Adam {
		
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter number :");
	int num = sc.nextInt(); // num = 12
	int a = sq(num); // a= 144
	int b = sq(rev(num)); // b = 441
	if(a == rev(b)) // 144 == 144 -> t
		System.out.println("Adam Number");
	else
		System.out.println("Not Adam Number");
	}
	
	static int sq(int num) // num 12
	{
		return (num*num); // 12*12 = 144
	}	
	
	static int rev(int num) // num = 12
	{
		int rev = 0;
		while(num>0) // 1 >0 -> t
		{
			int rem = num%10; // rem = 1%10 = 1
			rev = rev *10 + rem; // rev = 2*10 + 1 = 21
			num=num/10; // num = 12/10 = 1 
		}
		return rev; // r=21
	}
}
