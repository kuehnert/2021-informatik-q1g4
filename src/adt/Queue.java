package adt;

public class Queue {
    Item first;

    public Queue() {
        first = null;
    }

    // add(Element e) => Hängt ein Element hinten an die Schlange an
    public void add(int data) {
        Item tmp = new Item(data);

        if (first == null) {
            first = tmp;
        } else {
            Item runner = first;
            while (runner.next != null) {
                runner = runner.next;
            }

            runner.next = tmp;
        }
    }

    // isEmpty(): boolean => Gibt zurück, ob die Liste leer
    public boolean isEmpty() {
        return first == null;
    }

    // clear() => Leert die Schlange
    public void clear() {
        first = null;
    }

    // first(): Element => Gibt das vorderste Element zurück
    public int first() {
        if (first == null) {
            throw new RuntimeException("Schlange ist leer!");
        }

        return first.data;
    }

    //
    // remove(): Element => Entfernt das erste Element und gibt es zurück
    // size(): int => Gibt die Anzahl der Elemente zurück
}

class Item {
    int data;
    Item next;

    public Item(int data) {
        this.data = data;
    }
}
