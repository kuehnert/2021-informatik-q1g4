package adt.stack;

public class Stack<T> {
    Item<T> top;

    public Stack() {
        top = null;
    }

    public void push(T data) {
        // 1. Erstelle neues Element mit data
        Item<T> newItem = new Item(data);
        // 2. Setze Nachfolger von newItem
        // auf ehem. top
        newItem.setNext(top);
        // 3. top wird zu newItem
        top = newItem;
    }

    public T peek() {
        return null;
    }

    public T pop() {
        return null;
    }

    public int getSize() {
        return 0;
    }
}

class Item<T> {
    private T data;
    private Item<T> next;

    public Item(T data) {
        setData(data);
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Item<T> getNext() {
        return next;
    }

    public void setNext(Item<T> next) {
        this.next = next;
    }
}
