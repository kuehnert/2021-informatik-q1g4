package adt;

public class Queue {
    Item first;

    public Queue() {
        first = null;
    }

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
}

class Item {
    int data;
    Item next;

    public Item(int data) {
        this.data = data;
    }
}
