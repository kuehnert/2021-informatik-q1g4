package gui;

import sortieren.InsertionSort;

import java.util.Arrays;

public class SortierAusgabe {
    public static String sortieren() {
        String out = "";
        // Statisches Array
        int[] zahlen = {7, 20, 1, 5, 87, 9, 13, 10, 38, -1};
        InsertionSort sorter = new InsertionSort(zahlen);

        out += Arrays.toString(zahlen) + "\n";
        sorter.sortieren();
        out += Arrays.toString(zahlen) + "\n";

        return out;
    }
}
