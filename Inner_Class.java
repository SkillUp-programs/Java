package Pack5;
//outerclass with inner class
class Outer_Class  // outer class
{
	int num = 10;	
	private class Inner_class1    //inner class1
	{
		int x= 20;
		public void print()
		{
			System.out.println("inside inner class :"+num +" "+ x);
		}
		
	} // inner class
	
// Accessing inner class
	void display_Inner()
	{		
		Inner_class1 obj = new Inner_class1();
		obj.print();
		System.out.println("inner class value from outer class:"+obj.x);
		
	}
	
} // outer_class

// main class
public class Inner_Class 
{
	public static void main(String[] args) 
	{
      Outer_Class obj = new Outer_Class();
      obj.display_Inner();
	}
}
