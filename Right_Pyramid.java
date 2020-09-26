package Prgs6;
public class Right_Pyramid {
	public static void main(String[] args) {
	int n= 5;
	for(int i=1;i<=n;i++) // 5 rows, i =1,2
	{
		for(int j=n-i ; j>=1; j--)// j=3..1 -> for spaces
			System.out.print(" ");
		for(int j=1; j<=i; j++) //j=1..2 print *
			System.out.print("*");
		System.out.println(); // nextline
	}

	}

}
