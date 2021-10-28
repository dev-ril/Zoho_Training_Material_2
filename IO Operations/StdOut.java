//	5.	Write a program to redirect your print statements (System.out and System.err) to two files stdout.txt and stderr.txt.

import java.io.*;

class StdOut
{
	public static void main(String[] args) throws Exception
	{
		FileOutputStream targetFile = null;
		targetFile = new FileOutputStream("stdout.txt");

		PrintStream o = new PrintStream(targetFile);

		System.setOut(o);										 //Setting the output to get printed in the file
		
		System.out.println("The text goes into the file!!!");

	}
}