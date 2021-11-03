package sortieren;

import util.Util;

public class InsertionSort {
    int[] a;

    public InsertionSort(int[] input) {
        a = input;
    }

    public void sortieren() {
        // 7       / 2 3 1 0 8 5
        // 2 7     / 3 1 0 8 5
        // 2 3 7   / 1 0 8 5
        // 2 3 1 7 / 0 8 5
        // 2 1 3 7 / 0 8 5
        // 1 2 3 7 / 0 8 5
        //     j
        // 1 2 3 10    /  7
        // 1 2 3 7     / 10
        for (int i = 1; i < a.length; i++) {
            int j = i;
            while (j > 0 && a[j] < a[j - 1]) {
                Util.swap(a, j, j - 1);
                j -= 1;
            }
        }
        // for (int i = 1; i < a.length; i++) {
        //     for (int j = i; j > 0; j--) {
        //         if (a[j] < a[j-1]) {
        //             Util.swap(a, j, j-1);
        //         }
        //     }
        // }
    }
}
