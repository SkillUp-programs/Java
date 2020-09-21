package Prgs4;
import java.util.*;
public class Automorphic {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter number :");
	int n = sc.nextInt(); // n= 5
	int x=0;
	
	int sq = n*n; // sq = 25
	
	while(n>0) // 0>0 -> f
	{
	 if(n%10 != sq%10)  // 5%10 =5 != 25%10= 5 -> f
	  {
		x=1;
		break;
      }
	 n=n/10; // n=5/10 = 0
	 sq=sq/10; // sq = 25/10 = 2
	}
	if(x==0)
		System.out.println("Automorphic Number");
	else
		System.out.println("Not Automorphic Number");

	}

}
