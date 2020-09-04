package Formula_prgs2;
import java.util.*;
public class Hemisphere 
{
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("enter radius : ");
	int r = sc.nextInt();
	double v = (2.0/3.0)*(3.14)*(r*r*r);
System.out.println("Volume of hemisphere = "+ v);
	} }
