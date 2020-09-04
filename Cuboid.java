package Formula_prgs2;
import java.util.*;
public class Cuboid 
{
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("enter l,b,h :");
	int l = sc.nextInt();
	int b = sc.nextInt();
	int h = sc.nextInt();
	int v = l*b*h;
	System.out.println("volume of cuboid = "+v);
	} }
