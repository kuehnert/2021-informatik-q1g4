package adt.beispiele;

public class Klausur {
    private String zName;
    private int zPunkte;
    private int zNote;

    public Klausur(String pName) {
        this.zName = pName;
    }

    public String gibName() {
        return zName;
    }

    public int gibPunkte() {
        return zPunkte;
    }

    public void setzePunkte(int pPunkte) {
        this.zPunkte = pPunkte;
    }

    public int gibNote() {
        return zNote;
    }

    public void setzeNote(int pNote) {
        this.zNote = pNote;
    }
}
