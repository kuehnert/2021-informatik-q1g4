package sortieren;

import util.Util;

public class BubbleSort {
    int[] a;

    public BubbleSort(int[] input) {
        a = input;
    }

    public void sortieren() {
        // Äußere Schleife, separiert unsortierten von sortiertem Bereich
        for (int i = a.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (a[j] > a[j+1]) {
                    Util.swap(a, j, j+1);
                }
            }
        }
    }
}
