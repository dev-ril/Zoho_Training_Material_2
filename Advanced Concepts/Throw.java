//	10. How do you throw an exception?

import java.util.*;

class MyException extends Exception // Defining user-defined exception by extending the Exception class...
{
	public MyException(String s)	// Constructor of the class...
	{
		super(s);
	}
}
class Throw
{

	public static void main(String[] args) 
	{
		int i=0,j,k=0;
		System.out.println("Enter a number:\n");

		Scanner s = new Scanner(System.in);	

		j = s.nextInt();
		try
		{
			k=i/j;	

			if(k<10)
			{
				throw new ArithmeticException("The value of k must be greater than 10!!"); //Throwing ArithmeticException
			}

			if(k==10)
			{
				throw new MyException("This is also an exception!!"); //Throwing user-defined exception
			}
		}
		catch(ArithmeticException ae) // Catching the system defined exception
		{
			System.out.println("Exception occurred " + ae);
		}
		catch(MyException me) // Catching the user-defined exception
		{
			System.out.println("Exception occurred " + me);
		}
		
	}
}