package Prgs9;
import java.util.*;
public class Col5 {
	public static void main(String[] args) {
		HashSet h = new HashSet();
		h.add("a");
		h.add(10);
		h.add("c");
		h.add("z");
		h.add(null);
		System.out.println(h.add("z")); // false
		System.out.println(h);
} }
