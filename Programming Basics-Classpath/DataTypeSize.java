//Program to print the size(in bytes) of primitive data types in Java..

import java.util.*;

class DataTypeSize
{
	public static void main(String[] args)
	{
		System.out.printf("----------DATA TYPES AND THEIR SIZE----------\n\n");
		System.out.println("Size of Integer is "+Integer.BYTES + " bytes");
		System.out.println("Size of Float is "+Float.BYTES + " bytes");
		System.out.println("Size of Double is "+Double.BYTES + " bytes");
		System.out.println("Size of Long is "+Long.BYTES + " bytes");
		System.out.println("Size of Short is "+Short.BYTES + " bytes");
		System.out.println("Size of Character is "+Character.BYTES + " bytes");
	}
}