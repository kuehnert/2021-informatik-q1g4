package rekursion;

public class Ackermann {
    public static long ackermann(long n, long m) {
        if (n == 0) {
            return m + 1;
        } else if (m == 0) {
            return ackermann(n-1, 1);
        } else {
            return ackermann(n-1, ackermann(n, m-1));
        }
    }

    public static void main(String[] args) {
        int n = 3, m = 2;
        System.out.printf("ackermann(%d, %d) => %d%n", n, m, ackermann(n, m));
    }
}
