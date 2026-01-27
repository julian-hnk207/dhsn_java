public class VogelFlug {

    public static void main(String[] args) throws InterruptedException {
        String vogel = "\\ O /";
        int max = 20;

        while (true) {

            // links → rechts
            for (int i = 0; i <= max; i++) {
                clearConsole();
                printVogel(vogel, i);
                Thread.sleep(100);
            }

            // rechts → links
            for (int i = max; i >= 0; i--) {
                clearConsole();
                printVogel(vogel, i);
                Thread.sleep(100);
            }
        }
    }

    static void printVogel(String vogel, int pos) {
        for (int i = 0; i < pos; i++) {
            System.out.print(" ");
        }
        System.out.println(vogel);
    }

    static void clearConsole() {
        System.out.print("\033[H");
        System.out.print("\033[2J");
        System.out.flush();
    }
}