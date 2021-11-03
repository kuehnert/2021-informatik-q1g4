package test;

import sortieren.SelectionSort;
import util.ArrayGenerator;

import java.util.Arrays;

public class TestSelectionSort {
    public static void main(String[] args) {
        // Statisches Array
        int[] zahlen = {7, 1, 5, 87, 9, 13, 10, 38, -1};
        SelectionSort sorter = new SelectionSort(zahlen);

        System.out.println(Arrays.toString(zahlen));
        sorter.sortieren();
        System.out.println(Arrays.toString(zahlen));

        // Zufallsarray
        // int[] zahlen2 = ArrayGenerator.randomNumbers(100, 10_000);
        // SelectionSort sorter2 = new SelectionSort(zahlen2);

        // System.out.println(Arrays.toString(zahlen2));
        // sorter2.sortieren();
        // System.out.println(Arrays.toString(zahlen2));

    }
}
