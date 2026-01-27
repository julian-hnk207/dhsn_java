public class Test {
    public static void main(String[] args) {
        // Hier kannst du die gewünschte Anzahl der Zeilen vorgeben
        int anzahlZeilen = 10; 
        
        // Die äußere Schleife steuert die Zeilen
        for (int i = 1; i <= anzahlZeilen; i++) {
            
            // Die innere Schleife gibt die Sternchen in der aktuellen Zeile aus
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            
            // Nach jeder fertigen Zeile ein Umbruch
            System.out.println();
        }
    }
}