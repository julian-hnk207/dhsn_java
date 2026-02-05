import java.util.Scanner;

public class Sekunden
{
	public static void main (String [] args)
	{
		Scanner input = new Scanner(System.in);

		int sek_input;
		int sekunden;
		int minuten;
		int stunden;
		int tage;
		int rest;

		System.out.println("Eingabe Sekunden");
		sek_input = input.nextInt();
		
		tage = sek_input / 86400;		//60*60*24
		rest = sek_input % 86400;
		
		stunden = rest / 3600; //60*60
		rest = rest % 3600;
		
		minuten = rest / 60;
		sekunden = rest % 60;
		
		System.out.println(sek_input + "Sekunden entsprechen:");
		System.out.println("Tage: " + tage);
		System.out.println("Stunden: " + stunden);
		System.out.println("Minuten: " + minuten);
		System.out.println("Sekunden: " + sekunden);
		
		
	}
}

