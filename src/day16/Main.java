package day16;

public class Main {
    public static void main(String[] args) {
        FizzBuzzTree fb = new FizzBuzzTree();
        FizzBuzzTree buzzy = new FizzBuzzTree();
        fb.add("4");
        fb.add("3");
        fb.add("5");
        fb.add("2");
        fb.add("15");
        fb.add("20");
        fb.add("1");
        fb.add("6");

//        System.out.println(fb.toString());
//        System.out.println(fb.fizzBuzz(buzzy));
//        String actual = fb.fizzBuzz(buzzy);
//        System.out.println(actual);
        FizzBuzzTree.fizzBuzz(fb);
        System.out.println(FizzBuzzTree.fizzBuzz(fb));

    }
}
