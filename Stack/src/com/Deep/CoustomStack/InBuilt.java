package com.Deep.CoustomStack;

import java.util.Stack;

public class InBuilt {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(34);
        stack.push(18);
        stack.push(25);
        stack.push(25);
        stack.push(48);
        stack.push(23);


        System.out.println( stack.pop());
        System.out.println( stack.pop());
        System.out.println( stack.pop());
        System.out.println( stack.pop());
        System.out.println( stack.pop());
        System.out.println( stack.pop());
    }
}
