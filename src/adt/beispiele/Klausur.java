package adt.beispiele;

public class Klausur {
    private String zName;
    private int zPunkte;
    private int zNote;

    public Klausur(String zName) {
        this.zName = zName;
    }

    public String gibName() {
        return zName;
    }

    public int gibPunkte() {
        return zPunkte;
    }

    public void setzePunkte(int zPunkte) {
        this.zPunkte = zPunkte;
    }

    public int gibNote() {
        return zNote;
    }

    public void setzeNote(int zNote) {
        this.zNote = zNote;
    }
}
