package com.deep;

public class Main {
    public static void main(String[] args) {
//       DoublyLL list = new DoublyLL();
//       list.insertFrist(10);
//        list.insertFrist(20);
//        list.insertFrist(30);
//        list.insertFrist(40);
//        list.insertFrist(50);
//        list.insertFrist(60);
//       list.display();
//        System.out.println();
//       list.insertAfter(40,45);
//       list.display();

        CircularLL list = new CircularLL();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);
        list.insert(60);
        list.display();
        System.out.println();
        list.delete(40);
        list.display();

    }
}
