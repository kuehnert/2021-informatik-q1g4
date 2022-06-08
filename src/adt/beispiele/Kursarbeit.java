package adt.beispiele;

import java.util.Stack;

public class Kursarbeit {
    private Stack<Klausur> hLinkerStapel = new Stack<Klausur>();
    private Stack<Klausur> hRechterStapel = new Stack<Klausur>();
    private Stack<Klausur> hArbeitsplatz = new Stack<Klausur>();
    private Notentabelle hNotentabelle = new Notentabelle(1, 2, 3, 4, 5, 6);
    private int zAnzahlKlausuren = 0;

    public boolean istLinksLeer() {
        return hLinkerStapel.empty();
    }

    public boolean istAPLeer() {
        return hArbeitsplatz.empty();
    }

    public boolean istRechtsLeer() {
        return hRechterStapel.empty();
    }

    public void neueKlausur(String pName) {
        // Erstelle neue Klausur mit zName
        Klausur kl = new Klausur(pName);

        // Lege sie auf Linker Stapel
        hLinkerStapel.push(kl);

        // Erhöhe Anzahl der Klausuren um 1
        zAnzahlKlausuren++;
    }

    public void legeVonLinksAufAP() {
        if (istLinksLeer()) {
            return;
        }

        // Entferne eine Klausur vom linken Stapel und speichere sie in "klausur"
        Klausur klausur = hLinkerStapel.pop();
        // Lege "klausur" auf Stapel hArbeitsplatz
        hArbeitsplatz.push(klausur);
    }

    public void legeVonAPNachRechts() {
        if (istAPLeer()) {
            return;
        }

        hRechterStapel.push(hArbeitsplatz.pop());
    }

    public void zeigeSchritt() {
        System.out.println(hLinkerStapel.toString());
        System.out.println(hArbeitsplatz.toString());
        System.out.println(hRechterStapel.toString());
        System.out.println("-".repeat(80));
    }

    public void sortiere() {
        legeVonAPNachRechts();
        for (int i = 0; i < zAnzahlKlausuren; i++) {
            legeAlleVonRechtsNachLinks();
            zeigeSchritt();
            legeVonLinksAufAP();
            zeigeSchritt();
            while (!hLinkerStapel.isEmpty()) {
                Klausur lKlausur1 = (Klausur) hArbeitsplatz.peek();
                Klausur lKlausur2 = (Klausur) hLinkerStapel.peek();
                String lName1 = lKlausur1.gibName();
                String lName2 = lKlausur2.gibName();

                if (lName1.compareTo(lName2) < 0) {
                    legeVonLinksNachRechts();
                } else {
                    legeVonAPNachRechts();
                    legeVonLinksAufAP();
                }

                zeigeSchritt();
            }

            legeVonAPNachRechts();
            zeigeSchritt();
        }
    }

    private void legeVonLinksNachRechts() {
        if (istLinksLeer()) {
            return;
        }

        Klausur kl = hLinkerStapel.pop();
        hRechterStapel.push(kl);
    }

    private void legeAlleVonRechtsNachLinks() {
        while (!hRechterStapel.isEmpty()) {
            legeVonRechtsNachLinks();
        }
    }

    private void legeVonRechtsNachLinks() {
        if (istRechtsLeer()) {
            return;
        }

        hLinkerStapel.push(hRechterStapel.pop());
    }
}
