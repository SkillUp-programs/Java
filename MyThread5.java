package Prgs8;
class MyThreads extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{		
			System.out.println("sub class");
		}
	}
}
public class MyThread5
{
	public static void main(String[] args) 
	throws Exception
	{
		MyThreads obj = new MyThreads();		
		obj.start();		
		for(int j=1;j<=5;j++) 
		{
			Thread.sleep(3000);
			System.out.println("main class");
		}
	}
}
