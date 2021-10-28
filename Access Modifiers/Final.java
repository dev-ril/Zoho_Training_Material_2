//	11. What is the meaning of declaring a class final?

final class A
{
	public final int x; // 1.Only declaring

	public final int y = 10; //2.Declaration with assignment

	public static final int z; // Static final variable
	
	//Assigning
	// 1.Using instance-initializer block

	{
		x = 7;
	}

	//2.Using static block (only applicable for final static variables)

	static
	{
		z = 6;
	}

}

//Cannot extend class A as it is declared as a final class
/*class B extends A
{

}
*/

class Final
{
	public static void main(String[] args) 
	{	
		A obj = new A();

		//Illegal as it is already assigned
		//obj.x = 5; 

		System.out.println(obj.x);
		System.out.println(obj.y);
		System.out.println(obj.z);

	}
}