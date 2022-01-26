package rekursion;

public class TuermeVonHanoi {
    public static void tuerme(int anzahl, String start, String ziel, String zwischen) {
        if (anzahl > 1) {
            tuerme(anzahl-1, start, zwischen, ziel);
        }

        System.out.println("Verschiebe Scheibe von " + start + " nach " + ziel);

        if (anzahl > 1) {
            tuerme(anzahl-1, zwischen, ziel, start);
        }
    }

    static int bewegungenLuca = 2;
    public static void bewegungenLuca(int anzahl) {
        if (anzahl > 1) {
            bewegungenLuca = bewegungenLuca * 2;
            bewegungenLuca(anzahl - 1);
        } else {
            bewegungenLuca--;
        }
    }

    public static int bewegungenFormel(int anzahl) {
        return (int) Math.pow(2, anzahl) - 1;
    }

    public static int bewegungenIterativ(int anzahl) {
        int bewegungen = 0;

        for (int i = 0; i < anzahl; i++) {
            bewegungen = 2 * bewegungen + 1;
        }

        return bewegungen;
    }

    static int bewegungenRekursiv = 0;
    public static void bewegungenRekursiv(int anzahl) {
        if (anzahl > 1) {
            bewegungenRekursiv(anzahl-1);
        }

        bewegungenRekursiv = bewegungenRekursiv + 1;

        if (anzahl > 1) {
            bewegungenRekursiv(anzahl-1);
        }
    }

    public static void main(String[] args) {
        // tuerme(10, "Turm 1", "Turm 3", "Turm 2");
        int scheiben = 4;
        bewegungenLuca(scheiben);
        System.out.printf("Für %d Scheiben braucht man %d Züge%n", scheiben, bewegungenLuca);
        System.out.printf("Für %d Scheiben braucht man %d Züge%n", scheiben, bewegungenFormel(scheiben));
        System.out.printf("Für %d Scheiben braucht man %d Züge%n", scheiben, bewegungenIterativ(scheiben));

        System.out.println(bewegungenRekursiv);
        bewegungenRekursiv(scheiben);
        System.out.println(bewegungenRekursiv);
    }
}

