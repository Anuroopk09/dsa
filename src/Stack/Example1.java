package Stack;

import java.util.*;

public class Example1 {

    static class MyQueue {
        //Implementing a first in first out (FIFO) queue using only two stacks. The
        // implemented queue supports all the functions of a normal queue
        // (push, peek, pop, and empty).

        private Stack<Integer> inStack;
        private Stack<Integer> outStack;

        public MyQueue() {
            inStack = new Stack<>();
            outStack = new Stack<>();
        }

        public void push(int x) {
            inStack.push(x);
        }

        public int pop() {
            peek();
            return outStack.pop();
        }

        public int peek() {
            if (outStack.isEmpty()) {
                while (!inStack.isEmpty()) {
                    outStack.push(inStack.pop());
                }
            }
            return outStack.peek();
        }

        public boolean empty() {
            return inStack.isEmpty() && outStack.isEmpty();
        }
    }

    public static void main(String[] args) {

        String[] operations = {"MyQueue","push","push","peek","pop","empty"};
        int[][] values = { {}, {1}, {2}, {}, {}, {} };

        MyQueue obj = null;

        for (int i = 0; i < operations.length; i++) {
            switch (operations[i]) {
                case "MyQueue":
                    obj = new MyQueue();
                    System.out.println("null");
                    break;
                case "push":
                    obj.push(values[i][0]);
                    System.out.println("null");
                    break;
                case "peek":
                    System.out.println(obj.peek());
                    break;
                case "pop":
                    System.out.println(obj.pop());
                    break;
                case "empty":
                    System.out.println(obj.empty());
                    break;
            }
        }
    }
}