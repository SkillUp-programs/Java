package pack3;
class Add  // parent class
{
	void add(int a , int b)
	{
		System.out.println(" Add = "+(a+b));
	}
}
class Sub extends Add  // child class
{
	void sub(int x, int y)
	{		
		System.out.println("sub = "+(x-y));
	}
}
public class Inh 
{
	public static void main(String[] args) 
	{
       Sub obj = new Sub();
       obj.sub(40, 10);
       obj.add(20, 30);
	}
}
