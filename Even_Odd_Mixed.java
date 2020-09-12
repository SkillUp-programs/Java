package Prgs3;
import java.util.*;
public class Even_Odd_Mixed {
	
	static void print(int num) // num =1234
	{
		int n= num; // n =1234
		int f=1;  // even number
		while(num !=0 )  // num = 123 != 0 ->t
		{
			int d = num%10 ;  // d = 123%10=3
			// checks for mixed number
			if(n%2==0  && d%2==1)  // -> t
			// 1234%2==0 ->t && 4%2==1 -> f -> f			
			{
				f=2;  // mixed
				break;
			}
			else if(n%2==1 && d%2==0)// f
			{
				f=2; // mixed
				break;
			}
			
			num = num/10; // num = 1234/10= 123
		}
		if(f==1 && n%2 == 0)
		System.out.println("Full Even Number");
		else if (f==1 && n%2==1)
		System.out.println("Full Odd Number");
		else
		System.out.println("Mixed Number") ;		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter number");
		int num = sc.nextInt(); // 1234
		print(num);
	} }