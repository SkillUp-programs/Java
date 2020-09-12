package Prgs3;
import java.util.*;
public class Even_Odd_Count {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size");
		int s = sc.nextInt();  // s = 10
		int even=0,odd=0;
		int[] num = new int[s];
		System.out.println("enter "+ s + " values");
		for(int i=0; i<s; i++)
		{
			num[i] = sc.nextInt();	 // 10 values		
		}
		for(int i=0;i<s;i++)
		{
			if(num[i]%2==0)
				even++;
			else
				odd++;
		}
		System.out.println("even number count = "+even);
		System.out.println("odd number count = "+odd);
		} }
