package com.Deep.Queue;

public class CircularQueue {

    protected int[] data;
    private static final int Default_Size = 10;

    int end =0;
    int front = 0;
    int size =0;

    public CircularQueue() {
        this(Default_Size);
//   Or     this.data = new int[Default_Size];
    }

    public CircularQueue(int size) {
        this.data = new int[size];
    }

    public boolean isEmpty() {

        return size == 0;
    }

    public boolean isFull() {

        return size == data.length;
    }

    public boolean insert(int item){
        if (isFull()){
            return  false;
        }

        data[end++]=item;
        end = end% data.length;
        size++;
        return  true;
    }

    public int remove() throws Exception{
        if (isEmpty()){
            throw new Exception("Queue is EMpty!!");
        }

        int remove = data[front++];
        front = front%data.length;
        size--;


        return remove;


    }

    public int front() throws Exception{
        if (isEmpty()){
            throw new Exception("Queue is EMpty!!");
        }
        return data[front];

    }
    public void display() throws Exception{
        if (isEmpty()){
            throw new Exception("Queue is EMpty!!");
        }
        for (int i = front; i<size; i++){
            System.out.print(data[i] + " ");
        }

        System.out.println("End");

    }
}
