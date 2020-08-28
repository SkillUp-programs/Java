package pack4;
class B 
{
	void show() 
	{   final int x = 10;
//		x = 20;   // error
		System.out.println(" x = "+x);
	}
}
public class FinalEx 
{
	public static void main(String[] args) 
	{
B obj = new B();
obj.show();
	}
}
