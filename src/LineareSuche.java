import java.util.Arrays;

/**
 * Suchen Sie in einem Array von Kommazahlen eine Bestimmte, zB 3.5
 * HAUSAUFGABE:
 * Verbessern Sie die Suche so, dass Rundungsfehler die Suche nicht verhinden
 */
public class LineareSuche {
    private double[] zahlen;

    /**
     * Wird bei Erstellung eines Objekts von LineareSuche ausgefuehrt
     */
    public LineareSuche() {
        System.out.println("LineareSuche()");
        double gesucht = 3.1415 / 3.0 * 3.0;
        zahlen = new double[]{3.7, 5.4, 8.8, 1.2, 0.32, 5.432, 3.1415};

        int stelle = suchen(zahlen, gesucht);
        System.out.println("Zahl " + gesucht + " gefunden an Stelle " + stelle);
    }

    public static void main(String[] args) {
        System.out.println("main()");
        new LineareSuche();
    }

    public int suchen(double[] a, double gesucht) {
        System.out.println("suchen()");

        for (int i = 0; i < a.length; i++) {
            if (a[i] == gesucht) {
                return i;
            }
        }

        return -1;
    }
}

