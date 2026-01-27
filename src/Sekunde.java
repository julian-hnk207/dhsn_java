public class Sekunde{
	public static void main(String [] args)
	{
		int sek = IO.promptAndReadInt("Sekunden: ");
		
		int sekpromin = 60;
		int sekprostunde = 60*60;
		int sekprotag = 60*60*24;
		
		int tage = sek / sekprotag;
		int restNachTagen = sek % sekprotag;
		
		int stunden = restNachTagen / sekprostunde;
		int restNachStunden = restNachTagen % sekprostunde;
		
		int minuten = restNachStunden / sekpromin;
		int sekunden = restNachStunden % sekpromin;

		System.out.println("Das sind: ");
		System.out.println("Tage: " + tage);
		System.out.println("Stunden: " + stunden);
		System.out.println("Minuten: " + minuten);
		System.out.println("Sekunden: " + sekunden);
		}
}