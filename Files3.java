package Prgs9;
import java.io.*;
public class Files3 {
	public static void main(String[] args) 
	throws Exception
	{
		FileWriter fw = new FileWriter("e:\\abc.txt",true);
		fw.write("Aditya");
		fw.write(" Colleges");
		fw.flush();// to clear data in memory
		fw.close(); // close the opened file
		System.out.println("Done");
	}
}
