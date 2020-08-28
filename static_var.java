package pack4;
public class static_var 
{
   static int x =10;
   
   public static void main(String[] args)
   {
	static_var obj = new static_var();
	obj.x=50;
	System.out.println(obj.x);  // 50
	
	static_var obj2 = new static_var();
    System.out.println(obj2.x);  //50
   }
}
