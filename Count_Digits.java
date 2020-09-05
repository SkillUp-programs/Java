package Prgs1;
import java.util.*;
public class Count_Digits {
	public static void main(String[] args) {
	Scanner obj = new Scanner(System.in);
	System.out.println("enter number:");
	int num = obj.nextInt(); // num = 1234
	int count = 0;
	while(num != 0)  // 0 != 0 -> false
	{
		num = num/10 ; // num = 1/10 = 0(quotient)
		count = count + 1 ; // count  = 4
	}
	System.out.println("number of digits = "+ count);
	} }
