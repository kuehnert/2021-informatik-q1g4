package rekursion;

public class TuermeVonHanoi {
    static int bewegungenLuca = 2;
    static int bewegungenRekursiv = 0;

    private static void _tuerme(int anzahl, String start, String ziel, String zwischen) {
        if (anzahl > 1) {
            _tuerme(anzahl - 1, start, zwischen, ziel);
        }

        System.out.println("Verschiebe Scheibe von " + start + " nach " + ziel);

        if (anzahl > 1) {
            _tuerme(anzahl - 1, zwischen, ziel, start);
        }
    }

    public static void tuerme(int anzahl) {
        _tuerme(anzahl, "1", "3", "2");
    }

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

    private static void _bewegungenRekursiv(int anzahl) {
        if (anzahl > 1) {
            _bewegungenRekursiv(anzahl - 1);
        }

        bewegungenRekursiv = bewegungenRekursiv + 1;

        if (anzahl > 1) {
            _bewegungenRekursiv(anzahl - 1);
        }
    }

    // Starter-Methode
    public static void bewegungenRekursiv(int anzahl) {
        bewegungenRekursiv = 0;
        _bewegungenRekursiv(anzahl);
    }

    public static int bewegungenRekursivOhneNebeneffekte(int anzahl) {
        int bewegungen = 0;

        if (anzahl > 1) {
            bewegungen = bewegungen + bewegungenRekursivOhneNebeneffekte(anzahl - 1);
        }

        bewegungen = bewegungen + 1;

        if (anzahl > 1) {
            bewegungen = bewegungen + bewegungenRekursivOhneNebeneffekte(anzahl - 1);
        }

        return bewegungen;
    }

    public static int bewegungenRekursivOhneNebeneffekte2(int anzahl) {
        int bewegungen = 1;

        if (anzahl > 1) {
            bewegungen = bewegungen + 2 * bewegungenRekursivOhneNebeneffekte2(anzahl - 1);
        }

        return bewegungen;
    }

    public static void main(String[] args) {
        // tuerme(10);

        for (int scheiben = 1; scheiben < 7; scheiben++) {
            // bewegungenLuca(scheiben);
            // System.out.printf("Für %d Scheiben braucht man %d Züge%n", scheiben, bewegungenLuca);
            // System.out.printf("Für %d Scheiben braucht man %d Züge%n", scheiben, bewegungenFormel(scheiben));
            // System.out.printf("Für %d Scheiben braucht man %d Züge%n", scheiben, bewegungenIterativ(scheiben));
            System.out.printf("Für %d Scheiben braucht man %d Züge%n", scheiben, bewegungenRekursivOhneNebeneffekte(scheiben));
            System.out.printf("Für %d Scheiben braucht man %d Züge%n", scheiben,
                    bewegungenRekursivOhneNebeneffekte2(scheiben));
        }
    }
}

