package adt.queue;

public class Queue {
    Item first;

    public Queue() {
        first = null;
    }

    // add(Element e) => Hängt ein Element hinten an die Schlange an
    public void enqueue(int data) {
        Item tmp = new Item(data);

        if (first == null) {
            first = tmp;
        } else {
            Item runner = first;
            while (runner.getNext() != null) {
                runner = runner.getNext();
            }

            runner.setNext(tmp);
        }
    }

    // HA: "5127" => "[5, 12, 7]"
    public String print() {
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
    public int first() {
        if (first == null) {
            throw new RuntimeException("Schlange ist leer!");
        }

        return first.getData();
    }

    // dequeue(): Element => Entfernt das erste Element und gibt es zurück
    public int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue ist leer!");
        }

        int data = first.getData();
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

class Item {
    private int data;
    private Item next;

    public Item(int data) {
        setData(data);
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Item getNext() {
        return next;
    }

    public void setNext(Item next) {
        this.next = next;
    }
}
