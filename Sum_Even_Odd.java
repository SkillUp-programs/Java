package Prgs3;
import java.util.*;
public class Sum_Even_Odd {
	public static void main(String[] args) {
	Scanner obj = new Scanner(System.in);
	System.out.println("enter number :");
	int n = obj.nextInt(); // n= 1234
	int even_sum = 0, odd_sum =0;
	
	while( n != 0 ) // 0 != 0 -> f
	{
		int rem = n%10; // rem = 1%10 = 1
		if(rem%2==0)
		 even_sum = even_sum + rem; // even_sum =4+2 = 6
		else
		 odd_sum = odd_sum + rem; // odd_sum =3+1= 4 
		n= n/10;  // n= 1/10 = 0
	}
	System.out.println("even sum = "+ even_sum);
	System.out.println("odd sum = "+odd_sum);
	} }
