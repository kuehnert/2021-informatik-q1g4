package util;

import java.util.Arrays;
import java.util.stream.IntStream;

public class BrainTeasers {
    static void ohneSiebenerRobin() {
        for (int i = 1; i <= 200; i++) {
            if (i != i / 7 * 7) {
                System.out.print(i + " ");
            }
        }
    }

    static void ohneSiebenerLuca() {
        int x = 7;
        for (int i = 1; i <= 200; i++) {
            if (i == x) {
                x += 7;
            } else {
                System.out.print(i + " ");
            }
        }
    }

    static void ohneSiebenerFinn() {
        IntStream
                .range(0, 200/7)
                .forEach(x -> IntStream
                        .range(x * 7 + 1, x * 7+7)
                        .forEach(System.out::println));
    }

    public static void wonderSort(int[] a) {
        int[] z = new int[10000];

        for (int ai = 0; ai < a.length; ai++) {
            z[a[ai]]++;
        }

        int ai=0;for(int bi=0;bi<z.length;bi++){for(;z[bi]>0;z[a[ai++]=bi]--){}}
    }

    static void w(int[]a){int[]z=new int[10_000];for(int b=0;b<a.length;z[a[b++]]++){};int p=0;for(int q=0;q<z.length;q++){for(;z[q]>0;z[a[p++]=q]--){}}}

    public static void main(String[] args) {
        int[] a = {5, 12, 7, 21, 8, 3, 8,2 ,65, 23, 8, 3,43, 34,2, 45};
        System.out.println(Arrays.toString(a));
        // wonderSort(a);
        w(a);
        System.out.println(Arrays.toString(a));
    }

}
