package adt.test;

import adt.queue.QueueInt;

public class TestQueueInt {
    public static void main(String[] args) {
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
    }
}
