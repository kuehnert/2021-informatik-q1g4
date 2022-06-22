package adt.list;

import adt.queue.Item;
import adt.queue.Queue;

/*
 * Im Vergleich zur Queue Zusätzliche Methoden:
 *
 * 1. ✓ insertAt(int index, T data) => Einfügen an best. Stelle
 * 2. ✓ deleteAt(int index) => Lösche Item an best. Stelle
 * 4. ✓ toString() => Ausgeben
 * 5. ✓ get(int index) => gib Daten von El an Stelle index
 * 5a 1/2✓ set(int index, T data)
 * 6. indexOf(T data) => gib index von El mit Daten data
 * 7. delete(T data) => Löscht El mit Daten data
 * 8. swap(int index1, int index2) => vertauscht El an index1 und index2
 * 8. move(int index1, int index2) => Verschiebt El von index1 nach index2
 * 3. sort() => Sortieren
 */
public class List<T> extends Queue {
    public List() {
        first = null;
    }

    public int indexOf(T data) {
        if (isEmpty()) {
            return -1;
        }

        int index = 0;
        Item<T> runner = first;
        while (runner != null && !runner.getData().equals(data)) {
            runner = runner.getNext();
            index++;
        }

        if (runner.getData().equals(data)) {
            return index;
        } else {
            return -1;
        }
    }

    public T get(int index) {
        checkIndex(index);
        Item<T> runner = getItem(index);
        return runner.getData();
    }

    private Item<T> getItem(int index) {
        checkIndex(index);

        Item<T> runner = first;
        for (int i = 0; i < index; i++) {
            runner = runner.getNext();
        }

        return runner;
    }

    public void insertAt(int index, T data) {
        Item<T> ni = new Item<>(data);

        if (index == 0) {
            ni.setNext(first);
            first = ni;
        } else {
            // 1. Gehe mit runner auf das Vorgänger-Element von index
            Item<T> runner = getItem(index - 1);

            // 2. Setze den Nachfolger vom neuen Element auf
            //    den alten Nachfolger von runner
            ni.setNext(runner.getNext());

            // 3. Setze den Nachfolger von runner auf das neue
            //    Element
            runner.setNext(ni);
        }
    }

    public void deleteAt(int index) {
        checkIndex(index);

        if (index == 0) {
            first = first.getNext();
        } else {
            Item<T> pred = getItem(index - 1);
            pred.setNext(pred.getNext().getNext());
        }
    }

    private void checkIndex(int index) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("index cannot be negative");
        } else if (index > getSize()) {
            throw new IndexOutOfBoundsException("index too large");
        }
    }
}
