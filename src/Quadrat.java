import java.util.Scanner;

public class Quadrat {
	public static void main (String [] args){

		Scanner input = new Scanner(System.in);

		System.out.println("Eingabe Laenge: ");
		int laenge = input.nextInt();
		
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