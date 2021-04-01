package cz.educanet;

import java.util.ArrayList;

public class MathUtils {

    /**
     * Calculates the greatest common divisor.
     * https://www.bbc.co.uk/bitesize/guides/z9hb97h/revision/5
     * ie. for 8 and 12 => 4.
     * ie. for 10 and 5 => 5.
     * ect.
     *
     * @param a first number
     * @param b second number
     * @return GCD
     * největší společný dělitel
     */
    public static int findGreatestCommonDenominator(int a, int b) {
        ArrayList<Integer> list = new ArrayList<>();
        int gcd = 0;

        float a2 = (float) a;
        float b2 = (float) b;

        for (int i = 0; i <= a; i++) {
            if (a2 / i == Math.floor(a2 / i)) {
                list.add(i);
            }
        }
        for (int i = b; i <= b; i--) {
            if ((b2 / i == Math.floor(b2 / i)) && list.contains(i)) {
                gcd = i;
                return gcd;
            }
        }
        return 0;
    }


    /**
     * Calculates the lowest common multiple.
     * https://www.bbc.co.uk/bitesize/guides/z9hb97h/revision/5
     * ie. for 5 and 6 => 30.
     * multiples for 5: 5, 10, 15, 20, 25, *30*, 35...
     * multiples for 6: 6, 12, 18, 24, *30*...
     *
     * @param a first number
     * @param b second number
     * @return GCD
     */
    public static int findLowestCommonMultiple(int a, int b) {
        ArrayList<Integer> list = new ArrayList<>();
        int one = 0;
        int two = 0;
        int lowestCommonMultiple = 0;

        for (int i = 1; i <= b; i++) {
            one = a * i;
            list.add(one);
        }
        for (int j = 1; j < a; j++) {
            two = b * j;
            if (list.contains(two)) {
                lowestCommonMultiple = two;
                return lowestCommonMultiple;
            }
        }
        return 0;
    }

}
