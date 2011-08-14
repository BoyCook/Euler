package org.cccs;

/**
 * Hello world!
 */
// Answer = 233168
public class Problem1 {
    public static void main(String[] args) {
        System.out.println("Listing natural numbers: " + sumNaturalNumbers(0, 1000));
    }

    private static int sumNaturalNumbers(int start, int end) {
        int sum = 0;
        boolean isUsed;

        for (int i = start; i < end; i++) {
            isUsed = false;
            if (i % 3 == 0 && i != 0) {
                sum += i;
                isUsed = true;
                System.out.println(i + " is a multiple of 3 - adding to sum: " + sum);
            }

            if (i % 5 == 0 && i != 0) {
                if (!isUsed) {
                    sum += i;
                    System.out.println(i + " is a multiple of 5 - adding to sum: " + sum);
                }
            }
        }
        return sum;
    }
}