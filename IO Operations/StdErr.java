//	5.	Write a program to redirect your print statements (System.out and System.err) to two files stdout.txt and stderr.txt.

import java.io.*;

class StdErr
{
	public static void main(String[] args) throws Exception
	{
		FileOutputStream targetFile = null;
		targetFile = new FileOutputStream("stderr.txt");

		PrintStream e = new PrintStream(targetFile);

		System.setErr(e); 												//Setting the error to get written in the file
		
		try
		{
			throw new Exception("This text gets written in the file!!!");
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}

	}
}