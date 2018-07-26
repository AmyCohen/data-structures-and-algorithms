package day14;

import java.util.Stack;

public class MaxStack {

    public int max(){
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        Integer highValue = null;
        Integer holdValue = null;

        while(!s1.isEmpty()) {
            holdValue = s2.push(s1.pop());

            if(holdValue > highValue) {
                highValue = holdValue;
            }
        }

        while(!s2.isEmpty()) {
            s1.push(s2.pop());
        }
        return highValue;
    }

    public String toString(){
        return Stack.class.toString();
    }
}
