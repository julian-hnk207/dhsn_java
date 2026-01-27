public class Tannenbaum{
	public static void main (String [] args){
		int kronenhoehe = IO.promptAndReadInt("Eingabe Hoehe: ");
		
		zeichnekrone(kronenhoehe);
		
		int maxbreite = 2 * kronenhoehe -1;
		int stammbreite = maxbreite / 3 + 1;
		
		if (stammbreite % 2 == 0) {
            stammbreite++; // Falls gerade, um 1 erhöhen für Symmetrie
        }
		
		
		int stammhoehe = kronenhoehe / 3;
		int abstand = (maxbreite - stammbreite) / 2;
		
		
		zeichnestamm(stammbreite, abstand, stammhoehe);
		
		System.out.println("Ende");
	}
	
		public static void zeichnekrone (int kronenhoehe){
			for (int i = 1; i <= kronenhoehe; i++){
				for (int j = 0; j < kronenhoehe - i; j++){
					System.out.print(" ");
				}
				for (int k = 0; k < (2*i-1); k++){
				System.out.print("*");
				}
				System.out.println("");
			}
		}
	
		public static void zeichnestamm (int stammbreite,int abstand,int stammhoehe){
			for (int i = 0; i < stammhoehe; i++){
				for (int j = 0; j < abstand; j++){
					System.out.print(" ");
				}
				for (int k = 0; k < stammbreite; k++){
				System.out.print("*");
				}
				System.out.println("");
			}
		}
}