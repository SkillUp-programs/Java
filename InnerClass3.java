package Pack5;
abstract class AnonymousInner
{
	public abstract void myMethod();
}
public class InnerClass3 
{
	public static void main(String[] args) 
	{
		AnonymousInner inner =new AnonymousInner()  // instantiation
		{                           // declaration without classname
			public void myMethod()
			{
				System.out.println("Anonymous Inner Class");
			}
		};  // end of inner class	
		inner.myMethod();  // calling method
} }
