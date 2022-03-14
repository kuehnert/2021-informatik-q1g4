package rekursion;

public class Backtracking {
    public static void stringFunktionen() {
        String s = "jonas";
        // kümmer Dich um das "n"
        char c = s.charAt(2);   // => "n"
        String s3 = "jo" + "as"; // => "joas"
        String s1 = s.substring(0, 2);
        String s2 = s.substring(3);
        System.out.println(s3);
        System.out.println(s1);
        System.out.println(s2);
    }

    // romy
    public static void kombis(String schon, String noch) {
        if (noch.length() == 0) {
            System.out.println(schon);
        } else {
            for (int i = 0; i < noch.length(); i++) {
                // Nimm jeden einzelnen ("roten") noch-Buchstaben
                char c = noch.charAt(i);

                // und hänge ihn an "schon" dran
                String neuesSchon = schon + c;

                // rufe die Rekursion auf mit "schon" und
                // den restlichen "roten" Buchstaben
                String neuesNoch = noch.substring(0, i) + noch.substring(i + 1);
                kombis(neuesSchon, neuesNoch);
            }
        }
    }

    public static void kombis(String schon) {
        kombis("", schon);
    }

    public static void main(String[] args) {
        kombis("romy");
        kombis("maximilian");
    }
}
