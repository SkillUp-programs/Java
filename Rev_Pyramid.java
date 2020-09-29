package Prgs6;
public class Rev_Pyramid {
	public static void main(String[] args) {
	int n= 5; // rows
	for (int i=1; i <= 5; i++) // i=2 -> rows
	{
		for(int j=1; j<i; j++ ) // 1<2 -> f ->spaces
			System.out.print(" "); // 1 space
		for(int k=0; k <= n-i; k++)//  0 <= 3
			System.out.print("* ");// * * * * *
		
		System.out.println(); //nextline
	}
	} }
