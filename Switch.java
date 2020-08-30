package Pack2;
import java.util.*;
public class Switch 
{
  public static void main(String[] args)
  {
	  Scanner obj = new Scanner(System.in);
	  System.out.println("enter 2 numbers:");
	  float a = obj.nextFloat();
	  float b = obj.nextFloat();
	  System.out.println("a.Addition");
	  System.out.println("b.Substraction");
	  System.out.println("c.multiplication");
	  System.out.println("d.Division");
	  System.out.println("enter choice[a..d]:");
	  String ch = obj.next();  // a
	  switch(ch)
	  {
	  case "a": 
		  System.out.println("addition = "+(a+b));
		  break;
	  case "b":
		  System.out.println("substraction = "+(a-b));
		  break;
	  case "c":
		  System.out.println("multiplication = "+(a*b));
		  break;
	  case "d":
		  System.out.println("divition = "+(a/b));
		  break;
	  default:
		  System.out.println("invalid choice");		  
	  }
  }
}
