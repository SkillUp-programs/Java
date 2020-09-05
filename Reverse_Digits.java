package Prgs1;
import java.util.*;
public class Reverse_Digits {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("enter number :");
		int num = obj.nextInt();// num = 1234
		int rev = 0;
		while(num != 0 ) // 0 != 0 -> false
		{
			int rem = num%10;  // identify last digit , rem = 1%10 =1
			rev = rev*10 + rem; // rev = 432*10 + 1 = 4321
			num = num/10; //omit last digit , num = 1/10 = 0
		}
System.out.println("Reverse Number = "+rev);
	} }
