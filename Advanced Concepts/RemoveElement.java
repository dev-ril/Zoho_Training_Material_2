import java.util.*;
import java.io.*;

class RemoveELement
{
	public static void main(String[] args) 
	{
		Properties p = new Properties();

		p.setProperty("A","10");
		p.setProperty("B","20");
		p.setProperty("C","30");
		p.setProperty("D","40");
		p.setProperty("E","50");

		p.store(new FileWriter("prop1.properties"),"Properties File");

		Enumeration e = p.propertyNames();
		
		while(e.hasMoreElements())
		{
			Object element = e.nextElement();
			int index = element.indexOf(element);

			if(index == 2)
			{
				element.removeELement(index);
			}
		}

		Enumeration en = p.propertyNames();
		
		while(en.hasMoreElements())
		{
			String key = en.nextElement().toString();
			System.out.println(key + ": " + p.getProperty(key));
		}

	
	}
}