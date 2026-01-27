public class VarDekl
{
	public static void main(String [] args)
	{
		//Variablendeklaration
		
		int AZahl;		//Ganzzahl
		int BZahl;
		double Komma;   //Kommazahl
		String Kette;   //Zeichenkette
		
		//Inhalszuweisung
		AZahl = 3;
		BZahl = 5;
		Komma = 4.626;
		Kette = "Das ist ein Test.";
		
		//Berechnungen
		int intASumme = AZahl + AZahl;
		int intAProdukt = AZahl * AZahl;
		int intABDifferenz = AZahl - BZahl;
		
		
		System.out.println("Berechnungen:");
		System.out.println("Summe Zahl:" + intASumme);
		System.out.println("Produkt Zahl:" + intAProdukt);
		System.out.println("Differenz von Zahl a und Zahl b: " + intABDifferenz);
		System.out.println("Rest von Zahl A und Zahl B:  " + BZahl%AZahl);
	
	}
}