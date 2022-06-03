package adt.beispiele;

public class KlausurSimulation {
    public static void testNotentabelle() {
        Notentabelle tab = new Notentabelle(23, 48, 60, 72, 84);

        for (int i = 0; i <= 94; i++) {
            System.out.printf("%d Punkte: Note %d%n", i, tab.bestimmeNote(i));
        }
    }

    public static void main(String[] args) {
        Kursarbeit ka = new Kursarbeit();
        // ka.
    }
}
