package Formula_Prgs;
import java.util.*;
public class Simple_Interest 
{
	public static void main(String[] args) 
	{
	  Scanner obj = new Scanner(System.in);
	  System.out.println("enter p,r,n:");
	  int p = obj.nextInt();
	  int r = obj.nextInt();
	  int n = obj.nextInt();
      int si = (p*n*r)/100;
      System.out.println("Simple Interest = "+si);
	}
}
