package Prgs6;
import java.util.*;
public class Palindrome_Range {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter 2 numbers: ");
	int n1 = sc.nextInt(); // n1 = 100
	int n2 = sc.nextInt(); // n2 = 200
	
	for(int i=n1; i<=n2;i++) // i=101
		if(isPalindrome(i) == 1) // 1 == 1 -> t 
			System.out.print(i+" "); // 101 111 ..  191 
	}

	static int isPalindrome(int i)// i=101
	{
		int n=i;
		int rev=0;
		while(n > 0 ) // n = 0 > 0 -> f
		{
			int rem = n%10 ; //rem = 1%10=1
			rev = rev*10 +rem; // rev=10*10 + 1= 101
			n=n/10; // n= 1/10 = 0
		}
		if( i == rev) //101 == 101 -> t
			return 1;
		else
			return 0;
	}
}
