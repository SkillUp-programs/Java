package Hack1;
import java.util.Scanner;
public class Hack12_valid_username {
	    /*
	     * Write regular expression here.
	     */
	     public  static final String regularExpression = "([A-Za-z][A-Za-z0-9_]{7,29})";
	 
	}


	 class Solution2 {
	    private static final Scanner scan = new Scanner(System.in);
	    
	    public static void main(String[] args) {
	        int n = Integer.parseInt(scan.nextLine());
	        while (n-- != 0) {
	            String userName = scan.nextLine();

	            if (userName.matches(Hack12_valid_username.regularExpression)) {
	                System.out.println("Valid");
	            } else {
	                System.out.println("Invalid");
	            }           
	        }
	    }
	}