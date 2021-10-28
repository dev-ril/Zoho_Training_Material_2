/* 
* 5. Write an interface and try to bring out diff. between abstract class and an interface! (can I define variables in interfaces?)

Multiple Inheritance by classes is not supported by JAVA
class A
{

}

class B
{

}

class C extends A,B
{

}*/


interface A
{
	/*
	*By default, the methods are public, abstract,all the fields are public, static, and final.
	*Interfaces can only have abstract methods.
	*It must only be declared.
	*Abstract classes may contain non-final variables, whereas variables in interface are final, public and static
	*/

	final int n = 10;

	void show(); 
	
	// Can provide implementation for default methods
	public default void print()
	{
		System.out.println("default method!!");
	}

	// Can provide implementation for static methods
	public static void display()
	{
		System.out.println("Static method"); 
	}
}

//Classes cannot extend interface but can implement them

class C implements A 
{
	//Class implementing an interface must define the methods in that interface

	public void show() 
	{
		System.out.println("show..");
	}
}

/*interface B 
{
	void display();
}

interface C extends A,B  //Interfaces support multiple inheritance
{
	
}*/

class Interface
{
	public static void main(String[] args) 
	{
		//We cannot create object for interface but we can create reference to the implementing class..
		A obj1 = new C();
		obj1.show();
		System.out.println(obj1.n);

		A.display();

		C obj = new C();
		obj.show();

		obj.print();
	}
}