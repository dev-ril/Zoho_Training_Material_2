// 4. Write a java program to print the system properties (Hint : Refer to System class) Try to print the current working directory from you java program.

import java.io.*;
import java.util.*;

class SystemProperties
{
	public static void main(String[] args) 
	{
		System.getProperties().list(System.out);
		System.out.println();	
		System.out.println(System.getProperty("user.name"));
	}
}

/*
//Using Properties class
// get all the system properties
        Properties p = System.getProperties();
  
        // stores set of properties information
        Set set = p.entrySet();
  
        // iterate over the set
        Iterator itr = set.iterator();
        while (itr.hasNext()) {
  
            // print each property
            Map.Entry entry = (Map.Entry)itr.next();
            System.out.println(entry.getKey() + " = "
                               + entry.getValue());
        }
 */