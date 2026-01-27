public class Quadrat {
	public static void main (String [] args){
		int laenge = IO.promptAndReadInt("Eingabe Laenge: ");
		
		zeichnequadrat (laenge);
		System.out.println ("Ende");
		
	}
	
		public static void zeichnequadrat(int laenge){
			for (int i = 0; i <= laenge; i++){
				for (int j = 0; j <= laenge; j++){
					if (i == 0 || i == laenge || j == 0 || j == laenge){
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}
}