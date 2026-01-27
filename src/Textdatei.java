import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Textdatei{
	public static void main (String [] args) throws IOException {
		Files.writeString(
			Path.of("C:/Users/julian.hanke/Desktop/Uni-Zeug/Dateien Vorlesungen/Programmierung/Output/ausgabe.txt"),
			"Hallo Java"
		);
		System.out.println("Datei erfolgreich erstellt.");
	}
}

