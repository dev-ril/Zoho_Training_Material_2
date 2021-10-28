//	2.Function overriding & overloading ( Write a set of classes to bring out the difference!)

class A
{
	public void add(int i, int j) //Function add() with two integer arguments..
	{
		System.out.println(i + j);
	}

	public void add(int i, int j, int k)	//Function add() with three integer arguments..
	{
		System.out.println(i + j + k);
	}

	public void add(double i, double j)	//Function add() with two double arguments..
	{
		System.out.println(i + j);
	}
}

class Overload
{
	public static void main(String[] args) 
	{
			A obj = new A();

			obj.add(5, 10);
			
			obj.add(1, 2, 3);

			obj.add(1.5, 3.5);
	}
}