package adt.test;

import adt.beispiele.Kunde;
import adt.queue.QueueInt;
import adt.queue.QueueObject;

public class TestQueueObject {
    public static void main(String[] args) {
        QueueObject q = new QueueObject();
        System.out.println(q.isEmpty());
        System.out.println(q.getSize());
        q.enqueue("Hannes");
        q.enqueue(5.7);
        q.enqueue(5);
        q.enqueue(new Kunde("Jonas", "Walnuss"));

        int lieblingszahl = 777;
        q.enqueue(lieblingszahl);
        System.out.println(q.toString());

        System.out.println(q.getSize());
        q.enqueue(12);
        System.out.println(q.getSize());
        q.enqueue(7);
        System.out.println(q.getSize());
        System.out.println(q.isEmpty());
        System.out.println(q.toString());

        Object r;
        r = q.dequeue(); // "Hannes"

        if (r.getClass() == Kunde.class) {
            Kunde k = (Kunde) r;
            System.out.println("KUNDE Dequeued: " + k);
            System.out.println(k.getName());
            System.out.println(k.getSorte());
        } else {
            System.out.println(r.toString());
        }

        r = q.dequeue();
        System.out.println("Dequeued: " + r);
        r = q.dequeue();
        System.out.println("Dequeued: " + r);

        // Kunde
        r = q.dequeue();
        if (r.getClass() == Kunde.class) {
            Kunde k = (Kunde) r;
            System.out.println("KUNDE Dequeued: " + k);
            System.out.println(k.getName());
            System.out.println(k.getSorte());
        } else {
            System.out.println(r.toString());
        }


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
