package adt.test;

import adt.list.List;

public class TestList {
    public static void main(String[] args) {
        // List<String> l = new List<>();
        // l.enqueue("Jonas");
        // System.out.println(l.first); // proctected, daher kein Zugriff
        testInsertAt();
    }

    public static void testInsertAt() {
        List<Integer> l = new List<>();
        l.enqueue(0);
        l.enqueue(1);
        l.enqueue(2);
        l.insertAt(0, -1);
        System.out.println(l.toString());
    }

    // private static void testGet() {
    //     List<String> meineListe = new List<>();
    //     meineListe.enqueue("Erstes");
    //     meineListe.enqueue("Zweites");
    //     System.out.println(meineListe.get(1));
    //     System.out.println(meineListe.get(0));
    //     // System.out.println(meineListe.get(-20));
    //     // System.out.println(meineListe.get(6));
    // }
    //
    // private static void testEnqueue() {
    //     List<String> meineListe = new List<>();
    //     System.out.println(meineListe.getSize() + " Elemente");
    //
    //     meineListe.enqueue("Hallo");
    //     meineListe.enqueue("neue");
    //     meineListe.enqueue("schöne");
    //     meineListe.enqueue("Welt");
    //     System.out.println(meineListe.getSize() + " Elemente");
    //     System.out.println(meineListe);
    //
    //     meineListe.dequeue();
    //     meineListe.dequeue();
    //     meineListe.dequeue();
    //     meineListe.dequeue();
    //     System.out.println(meineListe.getSize());
    // }
    //
    // private static void testInsertAt() {
    //     List<String> meineListe = new List<>();
    //     System.out.println(meineListe);
    //     meineListe.insertAt(0, "1");
    //     System.out.println(meineListe);
    //     meineListe.insertAt(1, "3");
    //     System.out.println(meineListe);
    //     meineListe.insertAt(2, "5");
    //     System.out.println(meineListe);
    //     meineListe.insertAt(1, "2");
    //     System.out.println(meineListe);
    //     meineListe.insertAt(3, "4");
    //     System.out.println(meineListe);
    //     meineListe.insertAt(0, "-1");
    //     meineListe.insertAt(2, "-2");
    //     meineListe.insertAt(4, "-3");
    //     meineListe.insertAt(6, "-4");
    //     meineListe.insertAt(8, "-5");
    //     meineListe.insertAt(10, "-6");
    //     meineListe.insertAt(11, "6");
    //     System.out.println(meineListe);
    // }
    //
    // private static void testSwap() {
    //     List<String> meineListe = new List<>();
    //     meineListe.enqueue("Du");
    //     meineListe.enqueue("Oh");
    //     meineListe.enqueue("neue");
    //     meineListe.enqueue("schöne");
    //     meineListe.enqueue("Welt");
    //     meineListe.swap(0, 1);
    //     meineListe.swap(3, 2);
    //     System.out.println(meineListe);
    // }
    //
    // public static void main(String[] args) {
    //     // testSwap();
    //     // testGet();
    //     testInsertAt();
    //     // testSwap();
    // }
}
