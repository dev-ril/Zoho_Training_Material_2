// 7. Write a program to print all elements in a Properties object (Using Enumeration!)

import java.util.*;
import java.io.*;

class Prop
{
	public static void main(String[] args) throws Exception
	{
		// By default Properties can only hav <String,String> key-value pairs..

		Properties p = new Properties();

		//setProperty() method to set the value to the key..

		p.setProperty("A","10");
		p.setProperty("B","20");
		p.setProperty("C","30");
		p.setProperty("D","40");
		p.setProperty("E","50");

		p.store(new FileWriter("prop.properties"),"Properties File"); // Using streams to store the Properties to a file..

		Enumeration e = p.propertyNames();
		
		while(e.hasMoreElements()) // hasMoreElements() method of Enumeration traverses throught the enumeration till the end..
		{
			String key = e.nextElement().toString();	//nextElement() is used to iterate over the elements sequentially..

			System.out.println(key + ": " + p.getProperty(key));	//getProperty(String key) is to find the corresponding value for the specified key...
		}

	}

}