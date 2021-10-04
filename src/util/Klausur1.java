package util;

import java.util.Arrays;

public class Klausur1 {
    public static double median(int[] a) {
        // Hat Feld eine ungerade Länge => Zahl in der Mitte

        if (a.length % 2 == 1) {
            // Finde den Index der Mitte
            // Gib das Element an der Stelle zurück
            int indexMitte = a.length / 2;
            return a[indexMitte];
        } else {
            // Sonst gib den Mittelwert der beiden Zahlen in der Mitt zuück
            // Finde die beiden Indizes der Mitte
            // Berechne den Mittelwert der beiden Elemente
            // Gib diesen zurück
            int indexMitteR = a.length / 2;
            int indexMitteL = indexMitteR -1;
            return (a[indexMitteL] + a[indexMitteR]) / 2.0;
        }
    }

    public static int[] wachsendesFeld(int anzahl) {
        // erzeuge ein neues int-Array mit Länge <anzahl>
        int[] a = new int[anzahl];

        a[0] = (int) (Math.random() * 100);

        return a;
    }

    public static void main(String[] args) {
        // int[] a;
        // a = new int[]{1, 2, 3, 4, 5};
        // System.out.println(median(a));
        // a = new int[]{ 7, 8, 9, 10, 77, 89, 133, 155, 187 };
        // System.out.println(median(a));
        // a = new int[]{ 7, 8 };
        // a = new int[]{ 7, 8, 9, 10 };
        // a = new int[]{ 7, 8, 9, 10, 89, 133, 155, 187 };
        // System.out.println(median(a));

        int[] a = wachsendesFeld(10);
        System.out.println(Arrays.toString(a));
    }
}
