import java.util.Scanner;

public class Transfer_C_in_F
{
	public static void main (String [] args)
	{
		Scanner input = new Scanner(System.in);
		//Variablen
		double celsius;
		double fahrenheit;
		
		//Berechnung
		System.out.println("Bitte eine Zahl eingeben: ");
		celsius = input.nextDouble();
		System.out.println("Deine Eingabe: " + celsius);
		fahrenheit = 1.8 * celsius + 32;
		
		System.out.println("Umrechnung Grad Celsius in Grad Fahrenheit:");
		System.out.println(celsius + " Grad Celsius entsprechen " + fahrenheit + " Grad Fahrenheit.");
	}
}