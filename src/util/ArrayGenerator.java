package util;

public class ArrayGenerator {
    public static int[] randomNumbers(int n, int max) {
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            // falsch: 0.0 <= r < 1.0
            // a[i] = (int) Math.random() * max;
            // a[i] = ((int) Math.random()) * max;

            // richtig
            a[i] = (int) (Math.random() * max);
        }

        return a;
    }

    // Aufgabe:
    // Überlegen Sie 2 verschiedene Wege,
    // wie man Zahlenarrays erzeugen kann,
    // die garantiert keine Dopplungen enthalten
}
