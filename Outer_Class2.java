package Pack5;

public class Outer_Class2
{
	void my_Method()
	{				
		class MethodInner_class  // inner class
		{
			int num =20;
			public void print()
			{
				System.out.println("method local inner class = "+num);
			}
		}  // inner class
		
		MethodInner_class obj = new MethodInner_class();
		obj.print();
	}
	public static void main(String[] args) 
	{
		Outer_Class2 obj = new Outer_Class2();
        obj.my_Method();
	}

}
