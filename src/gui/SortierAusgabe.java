package gui;

import sortieren.InsertionSort;

import javax.swing.*;
import java.util.Arrays;

public class SortierAusgabe {
    private JTextArea textArea;
    private String out;

    public SortierAusgabe(JTextArea textArea) {
        this.textArea = textArea;
        out = "Neue SortierAusgabe";
        this.textArea.setText(out);
    }

    public void println(String s) {
        out += s + "\n";
        this.textArea.setText(out);
    }
}
