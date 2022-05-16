package adt.test;

import adt.beispiele.Kunde;
import adt.queue.Item;
import adt.queue.Queue;

public class TestQueue {
    public static void testItem() {
        Item<Kunde> ik = new Item<Kunde>(new Kunde("Finn", "Schnelleis"));
        System.out.println(ik);
        System.out.println(ik.getData());
    }

    public static void testQueueKunde() {
        Queue<Kunde> q = new Queue<Kunde>();
        q.enQueue(new Kunde("Tick", "Mickey"));
        q.enQueue(new Kunde("Trick", "Vanille"));
        q.enQueue(new Kunde("Track", "Schoko"));
        System.out.println(q.toString());
        Kunde k = q.deQueue();
        System.out.println("Rausgeworfen: " + k);
    }

    public static void main(String[] args) {
        testQueueKunde();
        /*
        QueueInt q = new QueueInt();
        System.out.println(q.isEmpty());
        System.out.println(q.getSize());
        q.enqueue(5);
        System.out.println(q.toString());

        System.out.println(q.getSize());
        q.enqueue(12);
        System.out.println(q.getSize());
        q.enqueue(7);
        System.out.println(q.getSize());
        System.out.println(q.isEmpty());
        System.out.println(q.toString());
        int r;
        r = q.dequeue();
        System.out.println("Dequeued: " + r);
        r = q.dequeue();
        System.out.println("Dequeued: " + r);
        r = q.dequeue();
        System.out.println("Dequeued: " + r);
        // r = q.dequeue();
        System.out.println("Dequeued: " + r);
        q.clear();
        System.out.println(q.getSize());
        System.out.println(q.isEmpty());
        System.out.println(q.toString());

         */
    }
}
