package Prgs2;
import java.util.*;
public class Fib_Not {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number :");
		int n = sc.nextInt(); // 5
		int a = 0, b= 1, c=0;
		while(c<n) // 5 < 5 -> false
		{
		  c = a+b;	// c = 2+3 =5
		  a=b; // a = 3
		  b=c; // b = 5
		}
    if(c==n)
    	System.out.println(n + " is Fibonacci Number");
    else
    	System.out.println(n + " is Not Fibonacci Number");
	} }
