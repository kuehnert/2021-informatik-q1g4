package rekursion;

import java.math.BigInteger;

public class FiboBigInt {
    public static BigInteger fibonacciIterativBI(int n) {
        BigInteger fib = BigInteger.valueOf(1), prev = BigInteger.valueOf(1);

        for (int i = 2; i <= n; i++) {
            BigInteger temp = fib;
            fib = fib.add(prev);
            prev = temp;
        }

        return fib;
    }

    public static void main(String[] args) {
        long start, duration;
        BigInteger result, difference, prevDifference;
        BigInteger atoms = BigInteger.valueOf(10).pow(79).multiply(BigInteger.valueOf(6));
        difference = BigInteger.valueOf(0);

        for (int i = 380; i < 400; i++) {
            start = System.currentTimeMillis();
            result = fibonacciIterativBI(i);
            duration = System.currentTimeMillis() - start;
            System.out.printf("f(%2d) iterativ = %15d; Dauer %.2f%n", i, result, duration / 1000.0);


            prevDifference = difference;
            difference = result.subtract(atoms).abs();
            System.out.println("prev. diff: " + prevDifference);
            System.out.println("difference: " + difference);

            // if (prevDifference.compareTo(difference) < 0) {
            //     System.out.println("\n\n\nÄhnlichste Zahl gefunden: ");
            //     System.out.printf("%d", difference);
            //     System.out.printf("f(%d) = %d%n", i, result);
            //     // break;
            // }

            // FibonacciMemoized fm = new FibonacciMemoized();
            // start = System.currentTimeMillis();
            // result = fm.fibonacciMemoized(i);
            // duration = System.currentTimeMillis() - start;
            // System.out.printf("f(%2d) rekursiv = %15d; Dauer %.3f%n", i, result, duration / 1000.0);
        }
    }
}


