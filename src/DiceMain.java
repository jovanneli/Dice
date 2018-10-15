import java.util.Scanner;
/**
 * 
 * @author Jovanne Li
 *
 */

public class DiceMain 

{
	public static void main(String[] args)
	{
		
		Dice jovi = new Dice();
		Dice peppa = new Dice();
		int roll1 = 0;
		int roll2 = 1;
		int sum1 = roll1 + roll2;
		while (roll1 != roll2)
		{
			roll1 = jovi.roll();
			roll2 = peppa.roll();
			sum1 = roll1 + roll2;
			System.out.println("Die 1: " + roll1 + " " + "Die 2: " + roll2 + 
			" Sum of roll: " + sum1);
		}
		System.out.println("Value of roll: " + roll1);
		System.out.println("Sum of rolls: " + sum1);
		System.out.println("Number of times rolled: " + jovi.numRolls());
		
		
		Scanner in = new Scanner(System.in);
		Dice natpole = new Dice();
		Dice boi = new Dice();
		int number1 = 0;
		int number2 = 0;
		int sum2 = number1 + number2;
		System.out.println("Please enter a number between 2 and 12: "); 
		int randomNumber= in.nextInt();
		
		while (randomNumber > 12 || randomNumber < 2)
		{
			System.out.println("That is not a valid number.");
			System.out.println("Please enter a number between 2 and 12: "); 
			randomNumber= in.nextInt();
		}
		
		while (sum2 != randomNumber)
		{
			number1 = natpole.roll();
			number2 = boi.roll();
			sum2 = number1 + number2;
			System.out.println("Die 1: " + number1 + " " + "Die 2: " + number2 + 
			" Sum of roll: " + sum2);
		}
		System.out.println("Number of times rolled: " + natpole.numRolls());
	
	}
}
