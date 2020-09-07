package Prgs2;
import java.util.*;
public class Sum_Fib {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("enter number :"); 
		int n = obj.nextInt();	// n= 10
		int t1 = 0, t2 = 1, t3 = 0, sum = t1+t2; // pre total = 1
		for(int i = 2;i<n;i++) // 4<10 -> true
		{
			t3 = t1+t2; // t3 = 1+2= 3 (fib no - 5rd pos)
			sum = sum + t3;  // sum =  4 + 3 = 7(sum- 5rd pos)
			t1 = t2;  // t1 = 1
			t2 = t3; // t2 = 2			
		}
		System.out.println(" sum of fib = "+ sum);
	} }
