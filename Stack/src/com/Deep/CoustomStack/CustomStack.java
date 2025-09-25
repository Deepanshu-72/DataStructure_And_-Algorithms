package com.Deep.CoustomStack;

public class CustomStack {
    protected int[] data;
    private static final int Default_Size = 10;

    int ptr =-1;

    public CustomStack() {
        this(Default_Size);
//   Or     this.data = new int[Default_Size];
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }

    public boolean push(int item){
        if (isFull()) {
            System.out.println("Stack is full");
            return false;
        }

        ptr++;
        data[ptr]= item;
        return true;
    }

    public int pop() throws StackException{
        if(isEmpty()){
            throw new StackException("Stack is already Enpty!!");
        }

//        int pop = data[ptr];
//
//
//        ptr--;
//        return pop;
        return data[ptr--];

    }

    public int peek() throws StackException{
        if(isEmpty()){
            throw new StackException(" cannot peek in empty Stack !!");
        }
        return data[ptr];
    }

    public boolean isFull() {

        return ptr == data.length-1;
    }

    public boolean isEmpty() {

        return ptr == -1;
    }


}
