package Pack2;
import java.util.*;
public class Array5 
{
	public static void main(String[] args) 
	{
	  Scanner sc = new Scanner(System.in);
	  System.out.println("enter row size:");
	  int r = sc.nextInt();  //3  
	  System.out.println("enter col size:");
	  int c = sc.nextInt();   //3
	  
	  int a[][] = new int[r][c];
	  int b[][] = new int[r][c];
	  int sum[][] = new int[r][c];
	  
	  System.out.println("enter "+r+" x "+c+" Matrix-A values");
	  
	  for(int i=0; i<r; i++)
	  {
		  for(int j=0;j<c;j++)
		  {
			  a[i][j] = sc.nextInt();
		  }
	  }

System.out.println("enter "+r+" x "+c+" Matrix-B values");
	  
	  for(int i=0; i<r; i++)
	  {
		  for(int j=0;j<c;j++)
		  {
			  b[i][j] = sc.nextInt();
		  }
	  }
	 

System.out.println("sum of 2 matrices:");
	  
	  for(int i=0; i<r; i++)
	  {
		  for(int j=0;j<c;j++)
		  {
			  sum[i][j] = a[i][j] + b[i][j];
			  System.out.print(sum[i][j]+" ");
		  }
	 	System.out.println();	  
	  }
  }	}

