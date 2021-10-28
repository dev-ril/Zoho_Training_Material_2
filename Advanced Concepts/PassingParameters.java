// 12. In java are the parameters passed by reference or by value (Write a program to test for basic data types , arrays ,strings ,string arrays and custom objects !)

import java.util.*;

class ObjectParameter
{
	int x;
}

class PassingParameters
{
	public static void main(String[] args) 
	{
		//Basic data types

			int i = 10;
			double d = 1.5;
			float f = 0.2f;
			dataTypes(i,d,f);

			System.out.println("The integer value is " + i);
			System.out.println("The double value is " + d);
			System.out.println("The float value is " + f);
			System.out.println();

		// Arrays

			int array[] = new int[]{1,2,3,4,5,6,7,8,9,10};
			System.out.println("before function call..");
			for(int it=0;it<10;it++)
			{
				System.out.print(array[it] + " ");
			}

			System.out.println();

			arrayFunction(array);

			System.out.println("after function call..");
			for(int it=0;it<10;it++)
			{
				System.out.print(array[it] + " ");
			}
			System.out.println("\n");

		//Strings

			String str = "Rilwan";
			System.out.println("before function call..");
			System.out.println(str);
			stringFunction(str);
			System.out.println("after function call..");
			System.out.println(str);
			System.out.println();

		//String Arrays

			String[] strArray = new String[] {"abc", "def", "ghi", "jkl", "mno"};
			System.out.println("before function call..");
			for(String s:strArray)
			{
				System.out.println(s);
			}
			stringArrayFunction(strArray);
			System.out.println("after function call..");
			for(String s:strArray)
			{
				System.out.println(s);
			}
			System.out.println();

		//Custom objects

			ObjectParameter obj1 = new ObjectParameter();
			obj1.x = 5;
			System.out.println("before function call.." + obj1.x);
			System.out.println("after function call.." + obj1.x);

	}

	public static void dataTypes(int i, double d, float f)
	{
		System.out.println("The integer value is " + i);
		System.out.println("The double value is " + d);
		System.out.println("The float value is " + f);
		i++;

		d = d+1.5;
		f = 9.8f;
	}

	public static void arrayFunction(int [] array)	// Affects the original array
	{
		for(int i=0;i<10;i++)
		{
			array[i]--;
		} 
	}

	public static void stringFunction(String str)	
	{
		str+="Hussain";
		System.out.println("in function.." + str);
	}

	public static void stringArrayFunction(String[] strArray) // Affects the original string array
	{
		strArray[0]="123";
		System.out.println("in function..");

		for(String s:strArray)
		{
			System.out.println(s);
		}
	}

	public static void customObjectFunction(ObjectParameter obj) // Affects the original object
	{
		obj.x += 10;
	}


}