public class Ausdruecke
{
	public static void main (String [] args)
	{
		int a;
		boolean ergebnis_a;
		boolean ergebnis_b;
		
		a = 5;
		ergebnis_a = a < 10 && a >= 0;
		ergebnis_b = a++ == 6 || a == 5;
		
		System.out.println ("Ergebnis A = " + ergebnis_a);
		System.out.println ("Ergebnis B = " + ergebnis_b);
	}
}