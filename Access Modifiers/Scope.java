/*
*	3. Learning about scope specifiers also what is the difference between instance variable and class variable? 
*	Write programs and try using local scope/method scope/member scope variables and how to access them.
*/

import java.util.*;

class A
{
	static int var = 25; 								// Class variable as it does not require instance creation. It can be accessed using the class name..

	//These are instance variables as they can be accessed only by the objects of the class..

	public int var1 = 5;
	private int var2 = 10;
	protected int var3 = 15;

	void function(int var1)
	{
		// Method Scope
		System.out.println("Method Scope");
		int val = 10; 									// this variable is accessible only this method. It's scope ends once the function ends..

		System.out.println("the value inside the method " + val);

		this.var1 = var1; 								// Here we are using this keyword to distinguish between the actual variable and the local variable

		System.out.println("\nInside the class\n");

		System.out.println("public inside class :"+var1);
		System.out.println("private inside class :"+var2);
		System.out.println("protected inside class :"+var3);
	}

}


class Scope
{
	public static void main(String[] args) 
	{
		System.out.println("Class variable " + A.var + "\n"); // We can access the static variable without creating the object.

		// Member scope

		A obj = new A();
		obj.function(6);

		System.out.println("\nOutside the class\n");
		System.out.println("public outside class :"+obj.var1);
		System.out.println("private members cannot be accessed outside the class");
		System.out.println("protected outside class :"+obj.var3+"\n");

		// Local scope

		// 1.Bracket scope

		System.out.println("Bracket Scope");
		{
			int x = 2;
			System.out.println("The value of x is "+x);
		}

		// System.out.println("\nThe value of x is "+x); // gives compilation error 

		// 2.Loop scope

		System.out.println("Loop Scope");
		for(int i=0;i<3;i++)
		{
			System.out.println(i + " ");
		}

		// System.out.println(i); // gives compilation error as i is not defined outside the loop

	}
}