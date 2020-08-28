package pack4;
public class Make_String 
{
	public static void main(String[] args) 
	{
		StringBuffer sb1 = new StringBuffer("suresh");
		System.out.println("old data : "+ sb1);
		sb1 = sb1.append(" kolagadi");
		System.out.println("new data :"+sb1);
		StringBuffer sb2 = new StringBuffer("naveen");
		System.out.println("reverse = "+sb2.reverse());
	}
}
