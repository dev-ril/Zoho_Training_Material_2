//	12. How do you prevent overriding of a method (can you prevent overloading of a method? - NO)

import java.util.*;

class A
{
	// By making it final
	public final void method1()
	{
		System.out.println("This is method 1");
	}

	//By binding using static keyword
	public static void method2()
	{
		System.out.println("This is method 2");	
	}

	//By making it private 
	//Cannot be accessed outside the class
	private void method3()
	{
		System.out.println("This is method 3");	
	}

	// 4.By making the method as default modifier so that any class from another package cannot overrride the method
}

class B extends A
{
	//As it is final in class A cannot be overridden

	/*public void method1()
	{
		System.out.println("This is overrided method 1");
	}*/

	public static void method2()
	{
		System.out.println("This is overrided method 2");	
	}

	//Cannot access the method as it is private in class A
	public void method3()
	{
		System.out.println("This is overrided method 3");
	}
}


class Override
{
	public static void main(String[] args) 
	{
		A obj1 = new A();

		A obj2 = new B();

		obj1.method1();
		obj1.method2();

		obj2.method2();//Will print the method2() of class A as it is statically binded

	}
}