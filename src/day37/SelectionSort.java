package day37;

import java.util.Arrays;
import java.util.Random;

public class SelectionSort {
    public static void main(String[] args) {
        randomN();
    }

    public static void randomN() {
        double[] tenThousandArrayOne = new double[10_000];
        double[] tenThousandArrayTwo = new double[10_000];
        Random r = new Random();

        for (int i = 0; i < 10_000; i++) {
        double dd = r.nextDouble();
            tenThousandArrayOne[i] = dd;
            tenThousandArrayTwo[i] = dd;

        }
        System.out.println(Arrays.toString(tenThousandArrayOne));
        System.out.println(Arrays.toString(tenThousandArrayTwo));
    }
}
