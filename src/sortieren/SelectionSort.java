package sortieren;

import util.Util;

public class SelectionSort {
    int[] a;

    public SelectionSort(int[] input) {
        a = input;
    }

    public void sortieren() {
        for (int i = 0; i < a.length - 1; i++) {
            int min = i;

            for (int j = i+1; j < a.length; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }

            Util.swap(a, i, min);
        }
    }
}
