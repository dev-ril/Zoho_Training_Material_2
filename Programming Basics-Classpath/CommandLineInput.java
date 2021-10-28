// Program to get input through command-line..

import java.util.*;

class CommandLineInput
{
	public static void main(String[] args)
	{
		int number;
		System.out.println("----------Getting input from the command line----------\n\nEnter a number:");
		Scanner s = new Scanner(System.in);

		number = s.nextInt();
		System.out.println("\nThe entered number is "+number);
	}
}