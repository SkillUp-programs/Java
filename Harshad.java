package Prgs3;
import java.util.*;
public class Harshad {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter number :");
	int n = sc.nextInt(); // n= 18
	
	int sum=0;
	int c=n; // c=18
	
	while(c>0) // 0>0 -> t
	{
		int rem = c%10; // rem = 1%10 = 1
		sum = sum + rem; // sum =8+1 =9
		c=c/10; //c=1/10 = 0
	}
	if(n%sum == 0 )
		System.out.println("Harshad number");
	else
		System.out.println("Not Harshad number");

	}

}
