import java.util.Scanner;

public class Zylinder{
public static void main (String [] args){

	Scanner input = new Scanner(System.in);

	System.out.println("Zylinder-Eigenschaften berechnen");

	System.out.println("Hoehe: ");
	double hoehe = input.nextDouble();
	System.out.println("Durchmesser: ");
	double durchmesser = input.nextDouble();
	double rad = durchmesser/2;
	double volumen = (Math.PI*(rad*rad)*hoehe);
	double mantel = (2*Math.PI)*rad*hoehe;
	
	System.out.println("Volumen: " + volumen);
	System.out.println("Mantelflaeche: " + mantel);
}
}