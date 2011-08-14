package org.cccs;

import java.math.BigInteger;

/**
 * User: Craig Cook
 * Date: Feb 19, 2009
 * Time: 11:49:14 PM
 */
/*
Task: Find largest primal factor of 600851475143 
 */
public class Problem3 {
    /*
        1 - Find largest factors
            a - Divide by 2
        2 - check if factors are prime
     */

    public static void main(String[] args){
        System.out.println(largestPrimeFactor(new BigInteger("600851475143")));
    }

    private static int largestPrimeFactor(BigInteger no) {
        System.out.println("No is: " + no.toString());
        BigInteger check = new BigInteger(no.divide(new BigInteger("2")).toString());
        System.out.println("No / 2 is: " + check);


//        while (true) {
//            break;
//        }

        return 0;
    }

    private static void testPrimeLogic() {
        for (int i=2; i<100; i++) {
            if (isPrime(i)) {
                System.out.println(i + " is prime");
            }
        }        
    }

    private static boolean isPrime(int no) {
        for (int i=2; i<no; i++) {
            //If it divides perfectly by a number
            if (no%i == 0 && i != no) {
                return false;
            }
        }
        return true;
    }
}