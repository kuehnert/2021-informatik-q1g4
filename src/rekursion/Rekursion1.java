package rekursion;

public class Rekursion1 {
    // Endlosrekursion
    public static void rekursion1() {
        rekursion1();
    }

    public static void rekursion2() {
        // Trivialfall oder Elementarfall oder nicht-rekursiver Fall
        if (true) {
            System.out.println("Keine Rekursion");
        } else {
            System.out.println("Rekursion");
            rekursion2();
        }
    }

    public static void rekursion3(int n) {
        // Trivialfall oder Elementarfall oder nicht-rekursiver Fall
        if (n == 0) {
            System.out.println("Lift-Off!");
        } else {
            System.out.println(n);
            rekursion3(n - 1);
        }
    }

    public static void rekursion4(int n) {
        // Trivialfall oder Elementarfall oder nicht-rekursiver Fall
        if (n == 0) {
            System.out.println("Lift-Off!");
        } else {
            rekursion4(n - 1);
            System.out.println(n);
        }
    }

    public static void rekursion5(int n) {
        // Trivialfall oder Elementarfall oder nicht-rekursiver Fall
        if (n == 0) {
            System.out.println("Lift-Off!");
        } else {
            System.out.println(n);
            rekursion5(n - 1);
            System.out.println(n);
        }
    }

    public static int multipliziereIterativ(int a, int b) {
        int produkt = 0;
        for (int i = 0; i < b; i++) {
            produkt = produkt + a;
        }
        return produkt;
    }

    public static int multipliziereRekursiv(int a, int b, int c) {
        if (b == 0) {
            return c;
        } else {
            return multipliziereRekursiv(a, b-1, c + a);
        }
    }

    public static void main(String[] args) {
        // rekursion5(5);
        System.out.println(multipliziereIterativ(4, 7));
        System.out.println(multipliziereRekursiv(4, 7, 0));
    }
}
