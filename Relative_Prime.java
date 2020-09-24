package Prgs5;
import java.util.*;
public class Relative_Prime {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter 2 numbers: ");
			int n1 = sc.nextInt(); // n1 = 35
			int n2 = sc.nextInt(); // n2 = 48
			int gcd = 1;
			for(int i = 1; i <= n1 && i <= n2; i++  ) //i=1..35 ,36->f
			{
				if( n1%i == 0 && n2%i == 0)// 35%35==0 && 48%35==0  -> f
					gcd = i ; // gcd = 1			
			}
			System.out.println(gcd);
			if( gcd == 1)
				System.out.println("relative prime");
			else
				System.out.println("not relative prime");
	} }
