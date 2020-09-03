package Formula_Prgs;
import java.util.*;
public class Pentagon 
{
	public static void main(String[] args) 
	{
	  Scanner obj = new Scanner(System.in);
	  System.out.println("enter length of a side:");
	  int s = obj.nextInt();
	  System.out.println("enter apothem length:");
	  int a = obj.nextInt();
	  float area = (float)(5/2)*s*a;
	  System.out.println("Area of Pentagon = "+ area);
	} }
