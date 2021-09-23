package suchen;

/**
 * Suchen Sie in einem Array von Kommazahlen eine Bestimmte, zB 3.5 HAUSAUFGABE: Verbessern Sie die Suche so, dass
 * Rundungsfehler die Suche nicht verhinden
 */
public class LineareSuche {
    private double[] zahlen;

    /**
     * Wird bei Erstellung eines Objekts von suchen.LineareSuche ausgefuehrt
     */
    public LineareSuche() {
        System.out.println("suchen.LineareSuche()");
        double gesucht = 3.1415 / 3.0 * 3.0;
        zahlen = new double[]{3.7, -0.5555, 98452456465465978.3876, 0.0, 0.000000000001};

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
            // a[i]    3.14122  => 31412
            // gesucht 3.14123  => 31412
            double delta = 0.000000001;
            if (gesucht >= a[i] - delta && gesucht <= a[i] + delta) {
                return i;
            }

            if ( Math.abs(gesucht - a[i]) <= delta ) {
                return i;
            }
        }

        return -1;
    }
}

