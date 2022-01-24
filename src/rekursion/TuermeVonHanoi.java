package rekursion;

public class TuermeVonHanoi {
    public static void tuerme(int anzahl, String start, String ziel, String zwischen) {
        if (anzahl > 1) {
            tuerme(anzahl-1, start, zwischen, ziel);
        }

        System.out.println("Verschiebe Scheibe von " + start + " nach " + ziel);

        if (anzahl > 1) {
            tuerme(anzahl-1, zwischen, ziel, start);
        }
    }

    public static void main(String[] args) {
        tuerme(10, "Turm 1", "Turm 3", "Turm 2");
    }
}

