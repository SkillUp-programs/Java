package pack3;
class Parent
{
	public void show()
	{
		System.out.println("Parent class");
	}
}
class Child extends Parent
{
	public void show()
	{
		System.out.println("overriding in child class");
	}
}

public class over_ride 
{
	public static void main(String[] args) 
	{
Child obj = new Child();
obj.show();
	}
}
