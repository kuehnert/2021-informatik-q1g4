package adt.beispiele;

public class Notentabelle {
    private int[] grenzen = new int[6];

    public Notentabelle(int ...grenzen) {
        this.grenzen = grenzen;
    }

    public int bestimmeNote(int pPunkte) {
        int note = 6;
        while (note > 1 && grenzen[6-note] < pPunkte) {
            note--;
        }

        return note;
    }
}
