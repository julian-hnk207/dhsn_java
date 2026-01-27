public class Zylinder{
public static void main (String [] args){
	System.out.println("Zylinder-Eigenschaften berechnen");
	
	double hoehe = IO.promptAndReadDouble("Hoehe: ");
	double durchmesser = IO.promptAndReadDouble("Durchmesser: ");
	double rad = durchmesser/2;
	double volumen = (Math.PI*(rad*rad)*hoehe);
	double mantel = (2*Math.PI)*rad*hoehe;
	
	System.out.println("Volumen: " + volumen);
	System.out.println("Mantelflaeche: " + mantel);
}
}