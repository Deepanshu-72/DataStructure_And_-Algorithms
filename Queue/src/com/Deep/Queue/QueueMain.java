package com.Deep.Queue;

public class QueueMain {
    public static void main(String[] args) throws Exception {
        CircularQueue queue = new CircularQueue(5);

        queue.insert(54);
        queue.insert(55);
        queue.insert(69);
        queue.insert(88);
        queue.insert(77);

        queue.display();
    }
}
