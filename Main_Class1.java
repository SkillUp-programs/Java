package Pack5;
class Static_Class  // outer class
{
	static class Nested_Class  // inner class1
	{
		static class Inner_Class  // inner class2
		{
			public void Method2()
			{
				System.out.println("static inner class2");
			}
		}
	}
}
public class Main_Class1  // main class
{
	public static void main(String[] args)   // main method
	{
 Static_Class.Nested_Class.Inner_Class obj = new Static_Class.Nested_Class.Inner_Class();
	  obj.Method2();
	}
}
