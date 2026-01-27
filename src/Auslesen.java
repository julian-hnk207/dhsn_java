import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Auslesen{
	public static void main(String [] args) throws IOException {
	/* 	String inhalt = Files.readString(Path.of("C:/Users/julian.hanke/Desktop/Uni-Zeug/Dateien Vorlesungen/Programmierung/Output/daten.txt"));
		System.out.println(inhalt);
		 */
		List<String> lines = Files.readAllLines(Path.of("C:/Users/julian.hanke/Desktop/Uni-Zeug/Dateien Vorlesungen/Programmierung/Output/daten.txt"));
		for (String line : lines){
			System.out.println(line);
		}
	}
}