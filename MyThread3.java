package Prgs8;
class MyThreadP extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{		
			System.out.println("sub class");
		}
	}
}
public class MyThread3
{
	public static void main(String[] args) 
	throws Exception
	{
		MyThreadP obj = new MyThreadP();		
		obj.start();
		obj.join();  // after sub class completed
		for(int j=1;j<=10;j++) // then main class will exec
		{
			System.out.println("main class");
		}
	}
}
