package com.deep;

public class CircularLL {
    private  Node head;
    private Node tail;

    public void insert(int val){
        Node node = new Node(val);
        if (head == null){
            head =node;
            tail = node;
            return;
        }
        node.next=head;
        tail.next = node;
        tail= node;
        return;

    }

    public void  delete(int val){
        Node node = head;
        if(node ==null){
            return;

        }
        if(node.val == val){
            head=head.next;
            tail.next=head;

        }

        do {

            Node n = node.next;
            if (n.val== val){
                node.next = n.next;
                break;
            }
            node=node.next;
        }while (node!=head);
        return;
    }

    void  display(){
        Node node = head;
        if (head!= null){
            do{
                System.out.print(node.val + "->");
                node= node.next;
            }
            while (node!=head);
        }
        return;
    }
    private class Node{
        int val;
        Node next;

        public Node(int val){
            this.val = val;
        }
    }
}
