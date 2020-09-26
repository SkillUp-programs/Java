package Prgs6;
public class Left_Pyramid {
	public static void main(String[] args) {
		for(int i = 1; i<= 5; i++) // 5 rows, i=2
		{
			for(int j = 1; j<=i; j++)// 5 cols, 2<=2 -> t
				{System.out.print("*");} // * 
			
			System.out.println();//nextline for every row
		}
	} }
