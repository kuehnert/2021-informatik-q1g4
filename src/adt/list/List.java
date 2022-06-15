package adt.list;

import adt.queue.Item;
import adt.queue.Queue;

/*
 * Im Vergleich zur Queue Zusätzliche Methoden:
 *
 * 1. insertAt(int index, T data) => Einfügen an best. Stelle
 * 2. deleteAt(int index) => Lösche Item an best. Stelle
 * 4. ✓ toString() => Ausgeben
 * 5. ✓ get(int index) => gib Daten von El an Stelle index
 * 5a- set(int index, T data)
 * 6. delete(T data) => Löscht El mit Daten data
 * 7. indexOf(T data) => gib index von El mit Daten data
 * 8. swap(int index1, int index2) => vertauscht El an index1 und index2
 * 8. move(int index1, int index2) => Verschiebt El von index1 nach index2
 * 3. sort() => Sortieren
 *
 */
public class List<T> extends Queue {
    public List() {
        first = null;
    }

    public T get(int index) {
        // Problem: index ist zu groß
        if (index > getSize()) {
            throw new IndexOutOfBoundsException("index too large");
        }

        Item<T> runner = first;

        for (int i = 0; i < index; i++) {
            runner = runner.getNext();
        }

        return runner.getData();
    }

    public void insertAt(int index, T data) {
        if (index < 0 || index > getSize()) {
            throw new IllegalArgumentException("Bye-bye!");
        }

        Item<T> ni = new Item<>(data);
        if (index == 0) {
            ni.setNext(first);
            first = ni;
        } else {
            // 2. Gehe mit runner auf das Vorgänger-Element von index
            Item<T> runner = first;
            for (int i = 0; i < index-1; i++) {
                runner = runner.getNext();
            }

            // 3. Setze den Nachfolger vom neuen Element auf
            //    den alten Nachfolger von runner
            ni.setNext(runner.getNext());

            // 4. Setze den Nachfolger von runner auf das neue
            //    Element
            runner.setNext(ni);
        }
    }























}
