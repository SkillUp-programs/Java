package pack1;
import java.util.*;
public class Rect {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("enter length:");
		int l = obj.nextInt();
		System.out.println("enter breadth:");
		int b = obj.nextInt();
		int a = l*b;
		System.out.println("area of rectangle = "+ a);
	}
}
