package Prgs9;
import java.io.*;
public class Files4 {
	public static void main(String[] args) 
	throws Exception
	{
	  File f = new File("e:\\abc.txt");
	  FileReader fr = new FileReader(f);
	  char[] ch = new char[(int)f.length()];
	  fr.read(ch); // reads all data from fr into ch avr
	  for(char c1 : ch)
	  {
		  System.out.print(c1);
	  }	  
}}
