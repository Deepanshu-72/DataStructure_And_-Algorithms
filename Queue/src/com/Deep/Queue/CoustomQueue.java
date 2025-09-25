package com.Deep.Queue;

public class CoustomQueue {

    protected int[] data;
    private static final int Default_Size = 10;

    int end =0;

    public CoustomQueue() {
        this(Default_Size);
//   Or     this.data = new int[Default_Size];
    }

    public CoustomQueue(int size) {
        this.data = new int[size];
    }

    public boolean isFull() {

        return end == data.length;
    }

    public boolean isEmpty() {

        return end == 0;
    }

    public boolean insert(int item){
        if (isFull()){
            return  false;
        }

        data[end++]=item;
        return  true;
    }

    public int remove() throws Exception{
       if (isEmpty()){
            throw new Exception("Queue is EMpty!!");
        }

       int remove = data[0];
        for (int i =1 ; i<end;i++){
            data[i-1] = data[i];
        }
        end --;

        return remove;


    }

    public int front() throws Exception{
        if (isEmpty()){
            throw new Exception("Queue is EMpty!!");
        }
        return data[0];

    }
    public void display() throws Exception{
        if (isEmpty()){
            throw new Exception("Queue is EMpty!!");
        }
        for (int i = 0; i<end; i++){
            System.out.print(data[i] + " ");
        }

        System.out.println("End");

    }
}
