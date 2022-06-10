package adt.queue;

public class Queue<T> {
    protected Item<T> first;

    public Queue() {
        first = null;
    }

    // enqueue(Element e) => Hängt ein Element hinten an die Schlange an
    public void enqueue(T data) {
        Item<T> tmp = new Item<T>(data);

        if (first == null) {
            first = tmp;
        } else {
            Item<T> runner = first;
            while (runner.getNext() != null) {
                runner = runner.getNext();
            }

            runner.setNext(tmp);
        }
    }

    // HA: "5127" => "[5, 12, 7]"
    public String toString() {
        if (isEmpty()) {
            return "[]";
        } else {
            String output = "[";
            // 1. Wir nehmen eine Variable runner und setzen sie auf first
            Item runner = first;

            // 2. Solange das Element runner einen Nachfolger hat
            while (runner.getNext() != null) {
                // 3. Drucke die data von runner aus
                output += runner.getData() + ", ";

                // 4. Setze runner auf das nächste Element
                runner = runner.getNext();
            }

            return output + runner.getData() + "]";
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
    public T first() {
        if (first == null) {
            throw new RuntimeException("Schlange ist leer!");
        }

        return first.getData();
    }

    // deQueue(): Element => Entfernt das erste Element und gibt es zurück
    public T dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue ist leer!");
        }

        T data = first.getData();
        first = first.getNext();
        return data;
    }

    public int getSize() {
        Item runner = first;
        int anzahl = 0;

        // 2. Solange das Element runner einen Nachfolger hat
        while (runner != null) {
            anzahl = anzahl + 1;

            // 4. Setze runner auf das nächste Element
            runner = runner.getNext();
        }

        return anzahl;
    }
}
