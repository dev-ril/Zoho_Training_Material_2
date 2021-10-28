//	2.Function overriding & overloading ( Write a set of classes to bring out the difference!)

class A
{
	public void show()
	{
		System.out.println("This is class A");
	}
}

class B extends A
{
	public void show() //Overridden method..
	{
		System.out.println("This is class B");
	}
}

class Override
{
	public static void main(String[] args) 
	{
		B obj = new B();
		obj.show();
	}
}