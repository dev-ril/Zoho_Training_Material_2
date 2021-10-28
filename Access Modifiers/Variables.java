//	3. Learning about scope specifiers also what is the difference between instance variable and class variable? 

import java.util.*;

class A
{
	int instanceVariable = 10;
	static int classVariable = 5;

	void setInstanceVariable(int n)
	{
		instanceVariable = n;
	}

	void setClassVariable(int n)
	{
		classVariable = n;
	}
}


class Variables
{
	public static void main(String[] args) 
	{
		A obj1 = new A();
		A obj2 = new A();

		System.out.println("Instance Variables\n");

		obj1.setInstanceVariable(15);
		obj2.setInstanceVariable(20);		

		System.out.println("Object 1: "+obj1.instanceVariable);
		System.out.println("Object 2: "+obj2.instanceVariable);

		System.out.println("\nClass Variables\n");

		obj1.setClassVariable(2);
		obj2.setClassVariable(5);
		
		System.out.println("Object 1: "+obj1.classVariable);
		System.out.println("Object 2: "+obj2.classVariable);

	}
}