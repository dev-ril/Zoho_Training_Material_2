// Reverse string using StringBuffer..

import java.util.*;

class ReverseString
{
	public static void main(String[] args) 
	{
		StringBuffer str = 	new StringBuffer("Rilwan");

		str.reverse(); // reverse() is an in-built method of StringBuffer used for reversing the given string..

		System.out.println(str);
	}
}