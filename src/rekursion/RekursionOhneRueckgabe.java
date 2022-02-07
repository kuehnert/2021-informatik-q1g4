package rekursion;

public class RekursionOhneRueckgabe {
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

    public static void main(String[] args) {
        // rekursion5(5);
    }
}
