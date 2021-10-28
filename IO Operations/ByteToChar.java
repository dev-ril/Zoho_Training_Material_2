//6.  Write a program to read a text file (using byte streams) convert the bytes to chars and print the output.

import java.util.*;
import java.io.*;

public class ByteToChar
{  
    public static void main(String[] args) throws Exception
    {  
         InputStream sourceFile = null;
         InputStreamReader iStream = null;

        try  
        { 
            sourceFile = new FileInputStream("Char.txt");  
            iStream = new InputStreamReader(sourceFile);  

            int i;
            while ((i = iStream.read()) != -1) //read() method of InputStreamReader calls the decoder which decodes the bytes into char into the default charset encoding..
            {  
                System.out.print((char) i);  
            }  
        }
        finally
        {
        	if(sourceFile!=null)
        	{
        		sourceFile.close();
        	}

        	if(iStream!=null)
        	{
        		iStream.close();
        	}
        }
    }  
}  