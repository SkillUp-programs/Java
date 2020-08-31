package pack3;
class A1  // composition or sub class
{
	public void sum(int x , int y)
	{
		System.out.println("sum = " + (x+y));
	}
}

class B1
{
	public void sub(int a, int b)
	{
		A1 obj = new A1();
		 obj.sum(20,10);
		System.out.println("sub = "+ (a-b));
	}
}


public class File1  // Aggregation or main class 
{
	public static void main(String[] args) 
	{	 
	 B1 obj2 = new B1();
	 obj2.sub(30, 10);
	 System.out.println("Main class");
	}
}
