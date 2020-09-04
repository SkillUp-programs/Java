package Formula_prgs2;
import java.util.*;
public class Cel_Far 
{
	public static void main(String[] args) 
	{
	  Scanner sc = new Scanner(System.in);
	  float f,c;
	  System.out.println("enter Celsius temperature :");
	  c = sc.nextFloat();
	  f = ((c*9)/5)+32;
	  System.out.println("farenheit = "+f);
	} }
