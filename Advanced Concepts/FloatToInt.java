//	1.Convert a float value to an integer (float to double etc.) (Hint use wrapper classes, do not typecast them!).

import java.util.*;

class FloatToInt
{
	public static void main(String[] args) 
	{
		float ft = 6.25f; //Primitive Data Type
		
		System.out.println("The float value is "+ ft);	

		// auto-boxing

		Float f = Float.valueOf(ft); //Creating Float Object from primitive type
		//Float f = ft;

		// unboxing
		
		int n = f.intValue(); //Returns an int value for this Float object

		System.out.println("The converted integer value is "+n);	
	}
}