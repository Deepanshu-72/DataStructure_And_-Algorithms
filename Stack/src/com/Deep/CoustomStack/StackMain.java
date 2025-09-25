package com.Deep.CoustomStack;

public class StackMain {
    public static void main (String[] args) throws StackException {
        CustomStack stack = new CustomStack();
        stack.push(55);
        stack.push(48);
        stack.push(25);
        stack.push(56);
        stack.push(77);


        System.out.println(stack.peek());



        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
