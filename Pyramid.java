package Prgs6;
public class Pyramid {
	public static void main(String[] args) {
		int n=5;
		for(int i = 1;i<=n; i++) //i = 5..1 , 5 rows
		{
			for(int j=n-i;j>=1;j--) // 4 spaces
			{
			System.out.print(" ");
			}
			for(int j = 1; j<=i; j++) // j=4..1
			{
				System.out.print("* "); // 4, 3 spaces
			}			
		System.out.println();
		}
	} }
