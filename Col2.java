package Prgs9;
import java.util.*;
public class Col2 {
	public static void main(String[] args) {
	LinkedList y = new LinkedList();
	y.add("suresh");
	y.add(4);
	y.add(null);
	y.add("naveen");
	System.out.println(y);
	y.set(2,"sw");
	y.addFirst("sai");
	y.removeLast();
	System.out.println(y);
	} }
