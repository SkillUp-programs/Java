package Hack1;


	import java.io.*;
	import java.util.*;

	public class Hack7_str_rev {

	    public static void main(String[] args) {
	        
	        Scanner sc=new Scanner(System.in);
	        String A=sc.next();
	        /* Enter your code here. Print output to STDOUT. */
	        int i = 0, j=A.length()-1;
	        while(A.charAt(i)==A.charAt(j) && i++<j--);
	        System.out.print(i>j?"Yes":"No");
	        
	    }
	}




