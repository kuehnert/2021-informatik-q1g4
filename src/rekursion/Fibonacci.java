package rekursion;

public class Fibonacci {
    // Memoization
    static long[] memos = new long[1000];

    public static long fibonacciRekursiv(int n) {
        System.out.println("Berechne f(" + n + ")");

        // Trivialfall, nicht-rekursiver Fall
        if (n <= 1) {
            return 1;
        } else {
            // Rekursiver Fall
            return fibonacciRekursiv(n - 1) + fibonacciRekursiv(n - 2);
        }
    }

    public static long fibonacciRekursivMemo(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return fibonacciRekursivMemo(n - 1) + fibonacciRekursivMemo(n - 2);
        }
    }

    public static void main(String[] args) {
        long start, result, duration;
        // fibonacciRekursiv(20);
        // System.out.println(counter + " Aufrufe");

        FibonacciMemoized fm = new FibonacciMemoized();
        System.out.println(fm.fibonacciMemoized(77));

        // for (int i = 30; i <= 52; i++) {
        //     start = System.currentTimeMillis();
        //     result = fibonacciRekursiv(i);
        //     duration = System.currentTimeMillis() - start;
        //     System.out.printf("f(%2d) = %15d; Dauer %.2f%n", i, result, duration / 1000.0);
        // }
    }
}
