package pack1;
import java.util.*;
public class Triangle {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("enter base value:");
		float b = obj.nextFloat();
		System.out.println("enter height value:");
		float h = obj.nextFloat();
		float a = (b*h)/2;
System.out.println("area of triangle = "+a);
	}
}
