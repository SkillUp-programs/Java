package Prgs5;
import java.util.*;
public class sastry {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter number :");
	int n = sc.nextInt(); // n= 183
	
	//to generate 183184
	String str = Integer.toString(n) + Integer.toString(n+1);
	//str = 183184
	int num = Integer.valueOf(str); // num = 183184
	
	double sr = Math.sqrt(num); // sr= 428
	if(sr - Math.floor(sr)==0)
		System.out.println("sastry number");
	else
		System.out.println("not sastry number");

	}

}
