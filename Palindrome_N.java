package Prgs3;
import java.util.*;
public class Palindrome_N {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter size :");
	int s = sc.nextInt(); // s = 3
	
	int n[] = new int[s];
	System.out.println("enter "+s+" numbers:");
	for(int i = 0; i<s; i++) // i<3 => i = 0,1,2  -> true
	{
		n[i] = sc.nextInt(); // 12321, 12345, 98789		
	}
	
	for(int i=0; i<s; i++)  // i=0
	{
		int rev = 0;
		int temp = n[i]; // temp =12321, 12345, 98789 -> one/one
		
		//reverse number of  a number
		while(n[i] > 0) // n[i] = 12321 > 0
		{
			int rem = n[i]%10 ;
			rev= (rev*10)+rem;  // 12321
			n[i]=n[i]/10;  // n =0
		}
		if(temp == rev)
			System.out.println(temp + " is Palindrome Number");
		else
			System.out.println(temp + " is Not Palindrome Number");
	}

	} }
