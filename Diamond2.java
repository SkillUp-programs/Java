package Prgs7;
public class Diamond2 {
	public static void main(String[] args) {
	int n = 5; // 5 rows
	int stars = 1;
	int space = n-1 ; //space =  4 
	for(int i=1; i<= n; i++) // 5 rows
	{
		for(int j= space; j>=i; j--)		
			System.out.print(" ");
		
		for(int k=1; k<= stars; k++)
			System.out.print("*"); // 9 stars
		
		stars = stars+2; // 11 stars
		System.out.println();		
	}
	
	n=4;
	stars = stars-4; // stars = 11-4 = 7
	space = n; // space = 4
	
	for(int i=n; i>=1; i--) // i= 4 rows
	{
		for(int j=space ; j>=i; j--) // 4 >= 4
			System.out.print(" ");
		
		for(int k=1; k<=stars;k++)
			System.out.print("*"); // 7 stars
		
		stars = stars-2;
		System.out.println();				
	}
} }
