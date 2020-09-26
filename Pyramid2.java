package Prgs6;
public class Pyramid2 {
	public static void main(String[] args) {
		int stars=1;
		int n=5;
		int space = n-1; // space = 4
		
		for(int i=1; i<=n; i++)// 5 rows
		{
			for(int j=space;j>=i;j--)
				System.out.print(" ");//4,3,2,1 spaces
			for(int k=1;k<=stars; k++)// 1,3,5,7,9,
				System.out.print("*");
			stars =stars+2; //stars=3
			System.out.println(); // nextline
		}

	}

}
