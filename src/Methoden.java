import java.util.Scanner;

public class Methoden {

    public static void einfach() {
        System.out.println("Das ist eine Methode");
    }

    public static void max(int a, int b) {
        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }

    public static int addieren(int x, int y) {
        return x + y;
    }

    public static int summe(int n1, int n2) {
        return n1 + n2;
    }

    public static int zweiHoch(int exponent) {
        if (exponent <= 0) {
            return 1;
        } else {
            return (int) Math.pow(2, exponent);
        }
    }

    // --- NEUE METHODEN FÜR DEN TANNENBAUM ---

    public static void zeichneKrone(int hoehe) {
        for (int i = 1; i <= hoehe; i++) {
            // Leerzeichen für die Symmetrie
            for (int leer = 1; leer <= hoehe - i; leer++) {
                System.out.print(" ");
            }
            // Sternchen (immer ungerade Anzahl)
            for (int stern = 1; stern <= (2 * i - 1); stern++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void zeichneStamm(int hoehe, int breite, int abstand) {
        for (int i = 0; i < hoehe; i++) {
            // Einrücken bis zum Stamm
            for (int leer = 0; leer < abstand; leer++) {
                System.out.print(" ");
            }
            // Stamm zeichnen
            for (int s = 0; s < breite; s++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

	public static void bmi(double G, double h, double wert){
		if (G <= 0 || h <= 0){
		System.out.println("ungueltige Eingabe");
		} else {
			wert = G / Math.pow(h, 2.0);
			wert = Math.round(wert * 100.0 / 100.0);
		}
		
		if(wert < 18.5){
			System.out.println(wert + " - Untergewicht");
		} else if (18.5 <= wert && wert < 25) {
			System.out.println(wert + " - Normalgewicht");
		} else if (25 <= wert && wert < 30){
			System.out.println(wert + " - Übergewicht");
		} else if (wert >= 30){
			System.out.println(wert + " - Adipositas");
		}
		
	}
	
	public static double wurzel (double hoch){
		double ergebnis = Math.sqrt(hoch);
		return ergebnis;
	}

    public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

        System.out.println("Beispiele für Methoden");
        int x = 10, y = 5, n1 = 7, n2 = 9, exponent = 4, num = 0;
		double h, G, wert = 0;

        einfach();
		System.out.println("1 - Tannenbaum, 2 - Addition, 3 - Summe, 4 - Exponent, 5 - BMI, 6 - Wurzel");
		System.out.println("Nummer");
		num = input.nextInt();
		
		switch (num) {
			case 1:
				System.out.println("\n--- Tannenbaum Beispiel ---");
        
				// Logik für die Baummaße
				int kHoehe = 7;
				int sHoehe = kHoehe / 3;
				int maxBreite = (2 * kHoehe) - 1;
				int sBreite = maxBreite / 3;
				
				 // Sicherstellen, dass Stammbreite ungerade ist
				if (sBreite % 2 == 0) {
					sBreite--;
				}
				
				// Abstand für die Zentrierung berechnen
				int abstand = (maxBreite - sBreite) / 2;

				// Aufruf der neuen Methoden
				zeichneKrone(kHoehe);
				zeichneStamm(sHoehe, sBreite, abstand);
				break;
			
			case 2:
				max(x, y);
				break;
			case 3:
				System.out.println("Ergebnis Summe: " + summe(n1, n2));
				break;
			case 4:
			    System.out.println("Ergebnis 2^" + exponent + ": " + zweiHoch(exponent));
				break;
			case 5:
				//BMI
				System.out.println("Körpergröße in Metern: ");
				h = input.nextDouble();
				System.out.println("Gewicht in Kilogramm: ");
				G = input.nextDouble();
				bmi(G, h, wert);
				break;
			case 6:
				System.out.println("Zahl: ");
				double hoch = input.nextDouble();
				double ergebnisWurzel = wurzel(hoch);
				System.out.println("Wurzel: " + ergebnisWurzel);
				break; 
				
		}
	
        System.out.println("Ende");
    }
}