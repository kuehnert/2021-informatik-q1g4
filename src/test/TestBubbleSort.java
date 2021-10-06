package test;

import sortieren.BubbleSort;
import util.ArrayGenerator;

import java.util.Arrays;

public class TestBubbleSort {
    public static void main(String[] args) {
        // Statisches Array
        int[] zahlen = {7, 1, 5, 87, 9, 13, 10, 38, -1};
        BubbleSort sorter = new BubbleSort(zahlen);

        System.out.println(Arrays.toString(zahlen));
        sorter.sortieren();
        System.out.println(Arrays.toString(zahlen));

        // Zufallsarray
        int[] zahlen2 = ArrayGenerator.randomNumbers(100, 10_000);
        BubbleSort sorter2 = new BubbleSort(zahlen2);

        // System.out.println(Arrays.toString(zahlen2));
        sorter2.sortieren();
        System.out.println(Arrays.toString(zahlen2));

    }
}
