package day14;

import java.util.Stack;

public class MaxStack extends Stack{

    private Stack<Integer> s1 = new Stack<>();
    private Stack<Integer> s2 = new Stack<>();

    public MaxStack () {
        this.s1 = s1;
        this.s2 = s2;
    }


    public int max(){
        //set s1 to be the value of what we call in the tests
        s1 = this;
        int highValue = 0;
        int holdValue = 0;

        //while s1 is NOT empty pop off the first value and maintain a record of it then push it into s2.
        while(!s1.isEmpty()) {
            holdValue = s2.push(s1.pop());

            if(holdValue > highValue) {
                highValue = holdValue;
            }
        }

        //while s2 is NOT empty pop off everything and push it back to s1 so it is in the original order.
        while(!s2.isEmpty()) {
            s1.push(s2.pop());
        }

        return highValue;
    }
}
