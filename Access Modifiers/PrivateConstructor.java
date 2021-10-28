// 7. Is it possible to have a private constructor? (write a class and try it out! ) , if possible how do you create an instance of it from another class?

class A
{
	static A obj = new A();

	void printScreen()
	{
		System.out.println("Private Constructor");
	}

	private A()	//Private constructor
	{

	}

	public static A getObject() //Object creation for this class is possible only through this method
	{
		return obj;
	}
}

class PrivateConstructor
{
	public static void main(String[] args) 
	{
		A obj1 = A.getObject();	

		obj1.printScreen();
	}
}