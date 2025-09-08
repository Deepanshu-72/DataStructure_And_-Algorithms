package com.deep;

public class DoublyLL {
    Node head;

    int size;

    public  DoublyLL(){
        this.size =0;
    }

    public void insertFrist(int val){
        Node node = new Node(val);
        if(head == null){
            node.prev = null;
            node.next = null;
            head = node;

            size++;
            return;
        }
        node.next = head;
        node.prev = null;
        head.prev = node;

        head = node;
        size++;
        return;
    }

    public void insertLast(int val){
        Node node = new Node(val);
        if(head == null){
            insertFrist(val);
            return;
        }
        Node temp = head;
        node.next = null;
        while (temp.next!= null){
            temp = temp.next;
        }
        temp.next= node;
        node.prev = temp;
        size++;
        return;
    }

    public void insertAfter(int after, int val){
        Node node = new Node(val);
        Node p = find(after);
        if (p == null){
            System.out.println("node dosent exist");
            return;
        }
        node.next = p.next;
        node.prev = p;
        p.next = node;
        if (node.next != null){
            node.next.prev = node;
        }
        size ++;
        return;




    }

    public Node find(int target){
        Node node = head;
        while (node != null){
            if(node.val == target){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.print("END");
    }


    private class Node{
        int val;
        Node next;
        Node prev;


        public Node (int val){
            this.val = val;
        }

        public Node (int val, Node next , Node prev){
            this.val = val;
            this.next = next;
            this.prev = prev;

        }
    }



}
