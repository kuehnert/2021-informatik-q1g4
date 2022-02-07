package rekursion;

public class RekursionRueckgabewerte {
    public static int multipliziereIterativ(int a, int b) {
        int produkt = 0;
        for (int i = 0; i < b; i++) {
            produkt = produkt + a;
        }
        return produkt;
    }

    public static int multipliziereRekursiv(int a, int b) {
        if (a == 0) {
            return 0;
        } else if (a == 1) {
            return b;
        } else {
            return b + multipliziereRekursiv(a - 1, b);
        }
    }

    public static int fakultaetIterativ(int n) {
        int fakultaet = 1;

        for (int i = 2; i <= n; i++) {
            fakultaet = i * fakultaet;
        }

        return fakultaet;
    }

    public static int fakultaetRekursiv(int n) {
        // Trivialfall
        if (n == 0) {
            return 1; // Das ist NICHT rekursiv
        } else { // Rekursiver Fall
            return n * fakultaetRekursiv(n-1);
        }
    }

    public static void main(String[] args) {
        // System.out.println(multipliziereIterativ(4, 7));
        // System.out.println(multipliziereRekursiv(4, 7));
        for (int i = 0; i < 15; i++) {
            System.out.println(i + ": " + fakultaetIterativ(i));
            System.out.println(i + ": " + fakultaetRekursiv(i));
        }
    }
}

// Fakultät
// 5! = 5 * 4 * 3 * 2 * 1
