package Prgs3;
import java.util.*;
public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number :");
		int n = sc.nextInt(); // n = 12321
		int num = n;  // num = 12321 
		int rev =0;
		//below loop is to reverse a given number
		while(num>0)  // 12321 > 0 -> true
		{
			int rem = num%10; // rem = 12321%10 = 1 , identifies last digit of a number 
			rev = (rev*10)+ rem ; //rev =1232*10+1 = 12321
			num = num/10; // num = 1/10 = 0
		}
if(n==rev)// n=12321 == 12321
System.out.println(n+" is Palindrome Number");
else
System.out.println(n+" is Not Palindrome Number");
} }
