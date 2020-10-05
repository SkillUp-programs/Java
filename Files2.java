package Prgs9;
import java.io.*;
public class Files2 {
	public static void main(String[] args)
	throws Exception
	{
		int c = 0;
		File f = new File("e:\\"); 
		// f object will hold id of specified location(e:)
		
		String[] s = f.list();
		//s var will hold all files and folders present in e:\
		
		for(String s1 : s)
		//for loop will fetch 1/1 values from s var to s1 var
		{
			File f1 = new File(f,s1);
//f1 object will hold id of s1(file/folder) present in f 
			if(f1.isFile()) // if f1 is filename -> true
			{
			System.out.println(s1);
			c++;
			}
		}
		System.out.println("total files = "+c);
	} }
