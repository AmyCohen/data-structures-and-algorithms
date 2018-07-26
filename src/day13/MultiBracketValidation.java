package day13;

import java.util.Stack;

public class MultiBracketValidation {

    public static void main(String[] args) {
        String test = "[(code)]";
        multiBracketValidation(test);
    }

    public static Boolean multiBracketValidation (String input) {
        String openParen = "(";
        String closeParen = ")";
        String openSquare = "[";
        String closeSquare = "]";
        String openCurly = "{";
        String closeCurly = "}";
        String holdChar;

        String openPop = "";
        String closePop = "";
        Boolean isEqual = false;

        Stack<Character> s1 = new Stack<>();
        Stack<String> s2 = new Stack<>();
        Stack<String> s3 = new Stack<>();
        Stack<String> s4 = new Stack<>();


        for (int i = 0; i < input.length(); i++ ) {
            s1.push(input.charAt(i));
        }
        System.out.println(s1.toString());

        while(!s1.isEmpty()) {
        holdChar = s1.pop().toString();
            if (holdChar.equals(openParen)
            || holdChar.equals(closeParen)
            || holdChar.equals(openSquare)
            || holdChar.equals(closeSquare)
            || holdChar.equals(openCurly)
            || holdChar.equals(closeCurly)
            ){
                s2.push(holdChar);
            } else {
                s1.pop();
            }
        }

        while (!s2.isEmpty()) {
            holdChar = s2.pop();
            if (holdChar.equals(openCurly)
            || holdChar.equals(openParen)
            || holdChar.equals(openSquare)
            ){
                s3.push(holdChar);
            } else {
                s4.push(holdChar);
            }
        }

        while(!s4.isEmpty()){
            s2.push(s4.pop());
        }
        System.out.println("s2 = " + s2.toString());
        System.out.println("s3 = " + s3.toString());
        while(!s3.isEmpty() && !s2.isEmpty()){
            openPop = s3.pop();
            closePop = s2.pop();

            if (openPop.equals(openCurly) && closePop.equals(closeCurly)){
                isEqual = true;
                } else if (openPop.equals(openParen) && closePop.equals(closeParen)){
                isEqual = true;
                } else if (openPop.equals(openSquare) && closePop.equals(closeSquare)){
                isEqual = true;
                } else {
                isEqual = false;
            }
        }
        System.out.println(isEqual);
        return isEqual;
    }
}
