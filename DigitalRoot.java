package Prgs5;
import java.util.*;
public class DigitalRoot {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter number :");
	int n = sc.nextInt(); //n= 99999
	int sum =0;
	while(n>0 || sum > 9 ) // 0>0 || 9>9 -> f
	{
		if(n==0)
		{
			n=sum; // n=45
			sum =0;
		}
		int rem = n%10; //rem = 4%10 = 4
		sum =sum+rem ; //sum = 5+4 = 9
		n=n/10; //n=4/10 =0
	}
System.out.println(sum); // sum =9
	}
}
