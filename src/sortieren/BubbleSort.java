package sortieren;

import java.util.Arrays;

public class BubbleSort {
    public BubbleSort() {
        int[] zahlen = {7, 1, 5, 87, 9, 13, 10, 38, -1};
        System.out.println(Arrays.toString(zahlen));
        sortieren(zahlen);
        System.out.println(Arrays.toString(zahlen));
    }

    public void sortieren(int[] a) {
        // Äußere Schleife, separiert unsortierten von sortiertem Bereich
        for (int i = a.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (a[j] > a[j+1]) {
                    swap(a, j, j+1);
                }
            }
        }
    }

    private void swap(int[] a, int x, int y) {
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }

    public static void main(String[] args) {
        new BubbleSort();
    }
}
