package pack1;
import java.util.*;
public class Cir_Circle {
	public static void main(String[] args) {
		Scanner obj = new Scanner (System.in);
		System.out.println("enter radius :");
		float r = obj.nextFloat();
		float c = 2 * 3.14f * r;
		System.out.println("area of circumference = "+c);
		System.out.printf("%1.2f",c);
	}
}
