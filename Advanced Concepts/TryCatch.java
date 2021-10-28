/*

* 9. How to you catch an exception? Write a program to catch a NullPointerException!
* NullPointerException:

* Invoking a method from a null object.
* Accessing or modifying a null object’s field.
* Taking the length of null, as if it were an array.
* Accessing or modifying the slots of null object, as if it were an array.
* Throwing null, as if it were a Throwable value.
* When you try to synchronize over a null object.

*/

class TryCatch
{
	public static void main(String[] args) 
	{
		int arr[] = null;

		//The part of code in which exception may occur is written inside the try block
		try
		{
			System.out.println(arr.length);		
		}

		//A single try block can have multiple catch blocks..

		catch(NullPointerException npe)
		{
		System.out.println("Exception occurred: "+ npe);	
		}

		//Always common Exception catch block must be written as the last catch block..

		catch(Exception e)
		{
			System.out.println("An exception had occurred, "+ e);

			//e.printStackTrace();  //Prints the result of toString() along with the stack trace to System.err, the error output stream.
		}
		
	}
}