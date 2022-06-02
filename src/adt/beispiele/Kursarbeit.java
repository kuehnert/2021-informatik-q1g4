package adt.beispiele;

import adt.stack.Stack;

public class Kursarbeit {
    private Stack<Klausur> hLinkerStapel = new Stack<Klausur>();
    private Stack<Klausur> hRechterStapel = new Stack<Klausur>();
    private Stack<Klausur> hArbeitsplatz = new Stack<Klausur>();

    public boolean istRechtsLeer() {
        return hRechterStapel.getSize() == 0;
    }

    public void legeVonLinksAufAP() {
        // Entferne eine Klausur vom linken Stapel und speichere sie in "klausur"
        Klausur klausur = hLinkerStapel.pop();
        // Lege "klausur" auf Stapel hArbeitsplatz
        hArbeitsplatz.push(klausur);
    }
}
