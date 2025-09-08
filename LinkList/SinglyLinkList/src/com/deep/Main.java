package com.deep;

public class Main {
    public static void main(String[] args) {
       DoublyLL list = new DoublyLL();
       list.insertFrist(10);
        list.insertFrist(20);
        list.insertFrist(30);
        list.insertFrist(40);
        list.insertFrist(50);
        list.insertFrist(60);
       list.display();
        System.out.println();
       list.insertAfter(40,45);
       list.display();
    }
}
