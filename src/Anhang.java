import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;


public class Anhang{
	public static void main (String [] args) throws IOException
	{
		Files.writeString(Path.of("C:/Users/julian.hanke/Desktop/Uni-Zeug/Dateien Vorlesungen/Programmierung/Output/log.txt"),
		"Bitte helfen Sie mir, ich kann nicht mehr");
		System.out.println("Text erfolgreich hinzugefügt");
		
		Path pfad = Path.of("C:/Users/julian.hanke/Desktop/Uni-Zeug/Dateien Vorlesungen/Programmierung/Output/log.txt");
		List<String> neueZeilen = List.of(
			"\nneue Zeile 1",
			"neue Zeile 2");
		Files.write(
			pfad,
			neueZeilen,
			StandardOpenOption.CREATE,
			StandardOpenOption.APPEND
			);
	}
	
}