// 5. Write an interface and try to bring out diff. between abstract class and an interface! (can I define variables in interfaces?)

import java.util.*;

abstract class A //A class automatically becomes abstract if it has an abstract method in it
{
	public abstract void show(); // Abstract methods can only be declared and cannot be defined
	public abstract void display();
}

abstract class B extends A
{
	public void show()
	{
		System.out.println("show..");
	}
}

class C extends B //Classes can only be defined as non-abstract once it has definition for all the abstract methods of the parent classes
{
	public void display()
	{
		System.out.println("display..");
	}
}

class Abstract
{
	public static void main(String[] args) 
	{
		// A obj = new A(); //Abstract classes cannot be instantiated

		C obj = new C();
		obj.show();
	}
}