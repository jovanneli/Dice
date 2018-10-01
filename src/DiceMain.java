
public class DiceMain 

{
	public static void main(String[] args)
	{
		Dice jovi = new Dice();
		System.out.println(jovi.roll());
		System.out.println(jovi.roll());
		System.out.println(jovi.numRolls());
		jovi.reset();
		System.out.println(jovi.roll());
		System.out.println(jovi.numRolls());
	}
}
