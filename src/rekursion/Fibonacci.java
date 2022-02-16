package rekursion;

public class Fibonacci {
    // Memoization
    static long[] memos = new long[1000];

    public static long fibonacciIterativ(int n) {
        long fib = 1, prev = 1;

        for (int i = 2; i <= n; i++) {
            long temp = fib;
            fib += prev;
            prev = temp;
        }

        return fib;
    }

    public static long fibonacciRekursiv(int n) {
        // System.out.println("Berechne f(" + n + ")");

        // Trivialfall, nicht-rekursiver Fall
        if (n <= 1) {
            return 1;
        } else {
            // Rekursiver Fall
            return fibonacciRekursiv(n - 1) + fibonacciRekursiv(n - 2);
        }
    }

    public static void main(String[] args) {
        long start, result, duration;

        for (int i = 90; i < 110; i++) {
            start = System.currentTimeMillis();
            result = fibonacciIterativ(i);
            duration = System.currentTimeMillis() - start;
            System.out.printf("f(%2d) iterativ = %15d; Dauer %.3f%n", i, result, duration / 1000.0);

        FibonacciMemoized fm = new FibonacciMemoized();
            start = System.currentTimeMillis();
            result = fm.fibonacciMemoized(i);
            duration = System.currentTimeMillis() - start;
            System.out.printf("f(%2d) rekursiv = %15d; Dauer %.3f%n", i, result, duration / 1000.0);
        }
    }
}
