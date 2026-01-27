/* public class EmE {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                // %-4d sorgt für saubere Spaltenausrichtung
                System.out.printf("%-4d", i * j);
            }
            System.out.println(); // Zeilenumbruch nach jeder Zeile
        }
    }
} */

/* public class EmE {
    public static void main(String[] args) {

        // Kopfzeile
        System.out.printf("%4s", "");
        for (int i = 0; i <= 10; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();

        // Tabelleninhalt
        for (int i = 0; i <= 10; i++) {
            // Zeilenüberschrift
            System.out.printf("%4d", i);

            for (int j = 0; j <= 10; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
} */

public class EmE {
    public static void main(String[] args) {

        // Kopfzeile
        System.out.print("\t");
        for (int i = 0; i <= 10; i++) {
            System.out.print(i + "\t");
        }
        System.out.println();

        // Tabelle
        for (int i = 1; i <= 10; i++) {
            // Zeilenüberschrift
            System.out.print(i + "\t");

            for (int j = 0; j <= 10; j++) {
                System.out.print((i * j) + "\t");
            }
            System.out.println();
        }
    }
}