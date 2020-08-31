package pack3;
interface A
{
	void Display1();   // abstract method or empty method
}
interface B
{
	void Display2();
}
class C implements A,B    // 1 child with multiple parents
{
	public void Display1()
	{
		System.out.println("Interface - A");
	}
	public void Display2()
	{
		System.out.println("Interface - B");
	}
}
public class Interface1 {
	public static void main(String[] args) {
		C obj = new C();
       obj.Display1();
       obj.Display2();
	} }
