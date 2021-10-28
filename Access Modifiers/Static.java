/*
 * 8. What is the meaning of declaring a variable "static" ? (write a program to bring out the difference between instance and class variables).
 * 9. What is the meaning of declaring a method "static" ? how do you invoke such a method ?
 * 10. What is the meaning of declaring a class static?
*/

class A
{
	static int a = 10;

	int b = 10;

	public static void show()
	{
		System.out.println("Static Method!!"); //No need of object creation
	}

	public void print()
	{
		System.out.println("Non Static Method!!"); // Requires object creation
		System.out.println(this.b);
	}

	public  static class B //Static Nested Class
	{

	public int x = 100;

	// Cannot access variable b of class A since it is non-static

	}

	public class C
	{	

	public int y=50;
	
	}
}

class Static
{
	public static void main(String[] args) 
	{
		//For static context
		A.a=5;
		System.out.println("The new value of a:"+A.a);

		A.show();

		//For non-static context
		A obj1 = new A();

		obj1.b = 4;
		System.out.println("The value of b:"+obj1.b);

		A obj2 = new A();

		obj2.b = 2;
		System.out.println("The value of b:"+obj2.b);

		obj1.print();	
		obj2.print();		

		//Static nested class (or) Static Inner class
		A.B obj3 = new A.B(); 
		System.out.println(obj3.x);

		//Non-static inner class
		A.C obj4 = new A().new C();
		System.out.println(obj4.y);
	
	}
}