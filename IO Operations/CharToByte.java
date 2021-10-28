// 3. How do you convert char streams to byte streams.

import java.io.*;

class CharToByte
{
    public static void main(String[] args) throws Exception
    {  
    	OutputStream targetFile = null;
    	OutputStreamWriter oStream = null;
  
        try 
        {  
           	targetFile = new FileOutputStream("byte.txt");  

         	oStream = new OutputStreamWriter(targetFile);  
  
            oStream.write("Mohamed Rilwan Hussain");  //write() method of OutputStreamWriter calls the encoder which converts the char into bytes internally  
        } 
        finally
        {
        	if(oStream!=null)
        	{
        		oStream.close();
        	}

        	if(targetFile!=null)
        	{
        		targetFile.close();
        	}
        }
    }  
}  