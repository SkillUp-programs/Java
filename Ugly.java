package Prgs3;
import java.util.*;
public class Ugly {
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number :");
    int n= sc.nextInt(); // n=18    
    int x=0; //ugly number
    while(n != 1) // 49 != 1 -> t
    {
    	if(n%2==0) // 9%2 ==0 -> f , 2 is a prime factor 
    		n=n/2; // n = 18/2 = 9 , next value
    	else if (n%3==0)  // 9%3==0 -> t, 3/3 == 0 -> t , 3 is a prime factor
    		n=n/3; // n=3/3 =1 , next value
    	else if(n%5==0)
    		n=n/5;
    	else
    	{
    		x=1;  // Not Ugly number
    		break;
    	}
    }
    if(x==0)
    System.out.println("Ugly Number");
    else
    System.out.println("Not Ugly Number");	
	} }
