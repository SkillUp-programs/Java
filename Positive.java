package Formula_prgs2;
import java.util.*;
public class Positive {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    System.out.println("enter size :");
    int n = sc.nextInt();  // n= 3
    int a[] = new int[n];
    System.out.println("enter "+n +" values : ");
    for(int i=0;i<n;i++)
    {
    	a[i] = sc.nextInt(); // 3 values -> 8,  -9,  7
    }    
    System.out.println("output : ");
    for(int j=0;j<n;j++)
    {
    	if(a[j] >= 0 ) 
    		System.out.println(a[j]+" is Positive");
    	else
    		System.out.println(a[j]+" is negative");    		
    }    
	} }
