package test;

import sortieren.InsertionSort;

import java.util.Arrays;

public class TestInsertionSort {
    public static void main(String[] args) {
        System.out.println("TestInsertionSort");

        // Statisches Array
        int[] zahlen = {7, 20, 1, 5, 87, 9, 13, 10, 38, -1};
        InsertionSort sorter = new InsertionSort(zahlen);

        System.out.println(Arrays.toString(zahlen));
        sorter.sortieren();
        System.out.println(Arrays.toString(zahlen));

        // Zufallsarray
        // int[] zahlen2 = ArrayGenerator.randomNumbers(100, 10_000);
        // InsertionSort sorter2 = new InsertionSort(zahlen2);

        // System.out.println(Arrays.toString(zahlen2));
        // sorter2.sortieren();
        // System.out.println(Arrays.toString(zahlen2));

    }
}
