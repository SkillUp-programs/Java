package Prgs2;
import java.util.*;
public class Nth_Fib {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("enter number :");
		int n = obj.nextInt(); // n = 9
		int a=0, b=1, c=0;
		for(int i=2; i<=n; i++) // 9 <= 9
		{
			c= a+b; // c = 13+ 21 = 34
			a=b; // a = 13
			b=c;  // b =21
		}
System.out.println("Fibonacci Number = "+c);
	}

}
