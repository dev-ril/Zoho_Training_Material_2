// Simple program to demonstrate few differences between String and StringBuffer
import java.util.*;

class StringStringBuffer
{
	public static void main(String[] args) 
	{
		String s = "Rilwan"; //Object instantiation is optional

		StringBuffer sb	= new StringBuffer("Rilwan"); //Object instantiation is compulsory

		s=s+"Hussain";	//Can use "+" operator for concatenation

		sb.append("Hussain"); //Use append() function for concatenation

		System.out.println(s);

		System.out.println(sb);
	}
}