import java.util.Scanner;

public class BMI {
	public static void main (String[] args){

		Scanner input = new Scanner(System.in);

		System.out.println("Eingabe Gewicht in kg: ");
		double g = input.nextDouble();
		System.out.println("Eingabe Höhe in m: ");
		double h = input.nextDouble();
		double bmi;
		
		//Berechnung
		bmi = g/(h*h);
		
		//Einordnung
	
		if (h <= 0 || g <= 0){
			System.out.println("Fehler bei Werteingabe; Ungueltiger BMI");
			System.exit(1);}
			else if (bmi < 18.5)
				System.out.println("BMI hat den Wert: " + bmi + " (Untergewicht)");
			else if (18.5 <= bmi && bmi < 25)
				System.out.println("BMI hat den Wert: " + bmi + " (Normalgewicht)");
			else if (25 <= bmi && bmi < 30)
				System.out.println("BMI hat den Wert: " + bmi + " (Übergewicht)");
			else if (bmi >= 30)
				System.out.println("BMI hat den Wert: " + bmi + " (Adipositas)");
		
		System.out.println("Ende");
	}
	}