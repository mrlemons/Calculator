/*
 * Variable Name    Datatype	Variable description
 * ----------------------------------------------------------------
 * userName			String		The users name
 * firstNumber		int			First number user wants to calculate
 * secondNumber		int			Second number the user wants to calculate*
 * total			int			Final calculated number
 * */

package lemons.llcs;

import java.util.Scanner;

//Testing
public class MainClass
{

	public static void main(String[] args)
	{
		String userName;
		int firstNumber;
		int secondNumber;
		int total;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Hello, what is your name?");
		
		userName = input.nextLine();
		
		System.out.println("Hello "+ userName);
		
		System.out.println("Please enter your first number.");
		
		firstNumber = input.nextInt();
		
		System.out.println("Your number is " + firstNumber);
		
		System.out.println("Please enter your second number");
		
		secondNumber = input.nextInt();
		
		System.out.println("Your second number is " + secondNumber);
		
		total = firstNumber + secondNumber;
		
		System.out.println(userName + " your total is: " + firstNumber + "+" + secondNumber + "=" + total );

	}

}
