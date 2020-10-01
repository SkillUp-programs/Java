package Prgs7;
public class Rev_Pyramid2 {
	public static void main(String[] args) {
	int n=5;  //rows
	int stars = n*2-1; // stars = 9
	int space =n-1; //space = 4
	for(int i=n; i>=1;i--) // i=5,4,3,2,1 rows		
	{
		for(int j=space; j>=i; j--) // 3 >= 4 -> t
					System.out.print(" ");
		
		for(int k=1; k<= stars; k++)
			System.out.print("*"); // 9,7,5,3,1 stars
		
		stars = stars -2; // stars = 9,7,5,3,1
		System.out.println();			
	}
}}
