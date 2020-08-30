package Pack2;
public class Array3 
{
	public static void main(String[] args) 
	{
	  int a[][] = { 
			  {1,2,3},  
			  {4,5,6}, 
			  {7,8,9} 
			  };
	  System.out.println("Array values:");
	  for(int i=0;i<3;i++)  //rows
	  {
		  for(int j=0;j<3;j++)  //cols
		  {
			  System.out.print(a[i][j]+" ");			  
		  }
		  System.out.println();
	  }  
	}
}
