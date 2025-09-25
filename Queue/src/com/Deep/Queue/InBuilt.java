package com.Deep.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class InBuilt {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>(); // create a LinkedList-based queue
        queue.add(3); // add element
        queue.add(5); // add more if you want

        System.out.println(queue); // print queue to check

    }
}
