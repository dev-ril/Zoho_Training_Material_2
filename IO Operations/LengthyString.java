//	4.	Write a program to read from a lengthy string (using streams) and write the output to a file.

import java.util.*;
import java.io.*;

class LengthyString
{
	public static void main(String[] args) throws IOException
	{
		FileWriter targetFile = null; 						// Using character streams.
		
		//FileOutputStream targetFile = null;				// Using byte streams.

		Scanner s = new Scanner(System.in);

		System.out.println("Enter a lengthy string:"); 		// Getting the string from the user..
		String str = s.nextLine();

		//byte[] str1 = str.getBytes();						// Converting into bytes..
		
		try
		{
			targetFile = new FileWriter("LengthyString.txt");
			targetFile.write(str);
		}
		finally
		{
			if(targetFile != null)
			{
				targetFile.close(); 						// Always close the stream if it is no longer in use. This ensures that the streams won’t be affected if any error occurs.
			}
		}
	}
}