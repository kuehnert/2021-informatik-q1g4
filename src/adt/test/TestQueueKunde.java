package adt.test;

import adt.beispiele.Kunde;
import adt.beispiele.QueueKunde;

public class TestQueueKunde {
    public static void main(String[] args) {
        QueueKunde q = new QueueKunde();
        System.out.println(q.isEmpty());
        System.out.println(q.getSize());
        q.enqueue(new Kunde("Willi1", "Blau1"));
        System.out.println(q.toString());

        System.out.println(q.getSize());
        q.enqueue(new Kunde("Willi2", "Blau2"));
        System.out.println(q.getSize());
        q.enqueue(new Kunde("Willi3", "Blau3"));
        System.out.println(q.getSize());
        System.out.println(q.isEmpty());
        System.out.println(q.toString());
        Kunde r;
        r = q.dequeue();
        System.out.println("Dequeued: " + r);
        r = q.dequeue();
        System.out.println("Dequeued: " + r);
        r = q.dequeue();
        System.out.println("Dequeued: " + r);
        r = q.dequeue();
        System.out.println("Dequeued: " + r);
        q.clear();
        System.out.println(q.getSize());
        System.out.println(q.isEmpty());
        System.out.println(q.toString());
    }
}
