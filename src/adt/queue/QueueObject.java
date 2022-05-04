package adt.queue;

public class QueueObject {
    ItemObject first;

    public QueueObject() {
        first = null;
    }

    // add(Element e) => Hängt ein Element hinten an die Schlange an
    public void enqueue(Object data) {
        ItemObject tmp = new ItemObject(data);

        if (first == null) {
            first = tmp;
        } else {
            ItemObject runner = first;
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
            ItemObject runner = first;

            // 2. Solange das Element runner einen Nachfolger hat
            while (runner.getNext() != null) {
                // 3. Drucke die data von runner aus
                output += runner.getData() + ", ";

                // 4. Setze runner auf das nächste Element
                runner = runner.getNext();
            }

            return output + runner.getData().toString() + "]";
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
    public Object first() {
        if (first == null) {
            throw new RuntimeException("Schlange ist leer!");
        }

        return first.getData();
    }

    // dequeue(): Element => Entfernt das erste Element und gibt es zurück
    public Object dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue ist leer!");
        }

        Object data = first.getData();
        first = first.getNext();
        return data;
    }

    public int getSize() {
        ItemObject runner = first;
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

class ItemObject {
    private Object data;
    private ItemObject next;

    public ItemObject(Object data) {
        setData(data);
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public ItemObject getNext() {
        return next;
    }

    public void setNext(ItemObject next) {
        this.next = next;
    }
}
