package pack4;

abstract class Transport
{
	void Color()
	{
		System.out.println("red");		
	}	
abstract int Wheels();   // abstract method	
}
class Car extends Transport
{
	int Wheels()
	{
		return 4;
	}
}
class Byke extends Transport
{
	int Wheels()
	{
		return 2;
	}
}

public class abstract_class {
	public static void main(String[] args) {
	Car obj = new Car();
	obj.Color();
	System.out.println("car has "+ obj.Wheels()+ " wheels");
	 Byke obj2 = new Byke();
	System.out.println("byke has " + obj2.Wheels()+ " wheels ");
    obj2.Color();
	}
}
