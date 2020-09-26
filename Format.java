package Prgs6;
import java.util.*;
public class Format {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter number :");
	int n = sc.nextInt(); // n= 5
	int i =1;
	while( n != 0) //n= 0 != 0 ->  f
	{
		if( i<n) // 5<5 -> f
		{
			System.out.print(i+" ");// 1 2 3 4 
			i++;
		}
		else
		{
			System.out.print(n+" ");// 1 2 3 4 5 4 3 2 1
			n--; // n= 0
		}
	}
	} }
