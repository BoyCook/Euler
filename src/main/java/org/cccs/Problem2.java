package org.cccs;

/**
 * User: Craig Cook
 * Date: Feb 19, 2009
 * Time: 5:41:37 PM
 */
//Answer = 4613732
public class Problem2 {
    
    public static long fib(int n) {
        if (n <= 1) return n;
        else return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        int max = 4000000;
        int sum = 0;
        long fib = 0;

        for (int i = 1; fib < max; i++) {
            fib = fib(i);

            if (fib < max) {
                if (fib%2 == 0)
                    sum += fib;

                System.out.println(i + " : " +  fib + " : " + sum);
            }
        }
    }
}