public class Ausgabe
{
	public static void main (String [] args)
	{
		//Aufgabe 2
		System.out.println ("Aufgabe 2: Arithmetische Ausdrücke:");
		System.out.println ("4 / 10 = " + (4/10));
		System.out.println ("3 / 2 = " + (3/2));
		System.out.println ("17 / 2.0 = " + (17/2.0));
		System.out.println ("13 % 4 = " + (13%4));
		System.out.println ("2 + 4 % 5 = " + (2+4%5));
		System.out.println ("2 * 4 % 5 = " + (2*4%5));
		System.out.println("");
		
		//Aufgabe 3
		
		int a;
		boolean ergebnis_a;
		boolean ergebnis_b;
		
		a = 5;
		ergebnis_a = a < 10 && a >= 0;
		ergebnis_b = a++ == 6 || a == 5;
		
		System.out.println ("Aufgabe 3: Logische Ausdrücke; a = 5" );
		System.out.println ("Ergebnis A von a < 10 && a >= 0 = " + ergebnis_a);
		System.out.println ("Ergebnis B von a++ == 6 || a == 5 = " + ergebnis_b);
		System.out.println("");
		
		//Aufgabe 4
		
		boolean p;
		boolean q;
		boolean r;
		
		//Bool01
		
		p = true;
		q = false;
		r = false;
		
		System.out.print("Aufgabe 4: Boolean-Ausdruecke");
		System.out.println("");
		System.out.println("Bool01:");
		System.out.println(p & q);
		System.out.println(p & q == r);
		System.out.println((p & q) == r);
		System.out.println("");
		
		//Bool02
		
		p = true;
		q = false;
		r = true;
		
		System.out.println("Bool02:");
		System.out.println(p |!q);
		System.out.println(p | q & r);
		System.out.println((p | q) & r);
		System.out.println("");
		
		//Bool3
		
		p = true;
		q = false;
		r = true;
		
		System.out.println("Bool03:");
		System.out.println((p & q) == r);
		System.out.println(p & (q == r));
		System.out.println((p | q) & (!r));
		System.out.println(p | (q & (!r)));
		
	}	
}