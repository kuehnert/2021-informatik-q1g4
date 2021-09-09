public class Zaehlen {
    public static void main(String[] args) {
        var summe = 0;
        var n = 10;

        for (int i = 1; i <= n; i++) {
            int q = i * i;
            summe += q;
        }

        System.out.println(summe);
    }
}

/**
 * Suchen Sie in einem Array von Kommazahlen die, die zwischen 10 und 20 sind. double[] = {1.1, 5.5, 11.1, 40.5}
 */