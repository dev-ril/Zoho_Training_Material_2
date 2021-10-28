//	4. Write a java program to print the system properties (Hint : Refer to System class) Try to print the current working directory from you java program.

import java.util.*;

class CurrentDir
{
	public static void main(String[] args) 
	{
		System.out.println("Current working directory : "+ System.getProperty("user.dir"));	 //Using the getProperty() method of the System class
	}
}