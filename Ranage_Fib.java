package Prgs2;
import java.util.*;
public class Ranage_Fib {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter number :");
	int n = sc.nextInt();  // n= 10
	int t1 = 0, t2 = 1;
	System.out.println("Fib range upto :"+n + " :");
	System.out.print(t1+ " "+t2); // 0 1
	for(int i= 2; i<=n; i++)
	{
		int sum = t1+t2; // sum = 0+1 = 1
		t1=t2;
		t2=sum;		
		
		if(sum>n)
		{	break; }
		
		System.out.print(" "+sum);
	}
} }
