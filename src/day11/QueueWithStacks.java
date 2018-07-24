package day11;

import java.util.Stack;

public class QueueWithStacks {
        private Stack<Integer> s1;
        private Stack<Integer> s2;

        public QueueWithStacks() {
            this.s1 = new Stack<>();
            this.s2 = new Stack<>();
        }

    public void enqueue (int value) {
        /*
        Using the Stack type to push values into the Queue so it is always shoving the front forward.
         */
        s1.push(value);
    }

    public int dequeue () {

        int result = 0;


        //If stack1 is empty, return a default value of -999. I could not get it to work to return an exception for an empty stack.
        if (s1.isEmpty()) {
            return -999;
        }

        //As long as stack1 is NOT empty, keep pushing the values into stack2 by popping them off of stack1.
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        //return the value of what was popped off
        result = s2.pop();

        //while stack2 is NOT empty, return all the values into their original order in stack2 by popping them off stack2 and pushing them into stack1.
        while(!s2.isEmpty()) {
            s1.push(s2.pop());
        }
        return result;
    }
    /*
    followed StackOverflow for writing toString() because I always forget the way Steve does it.
    https://stackoverflow.com/questions/5413934/values-in-queue-java
     */
    @Override public String toString() {
        return s1.toString();
    }

}
