package Formula_prgs2;
import java.util.*;
public class Trapezium 
{
	public static void main(String[] args) 
	{
	 Scanner sc = new Scanner(System.in);
	 System.out.println("enter 2 sides : ");
	 int a = sc.nextInt();
	 int b = sc.nextInt();
	 System.out.println("enter height : ");
	 int h = sc.nextInt();
	 double area = (a+b) *(h) /2.0;
	 System.out.println("Area of Trapezium = "+area);	 
	} }
