package homeworkweek8;

import java.util.Scanner;

/**
 * 12. Write a programme to input any number and check if it is prime or not.
 * (Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words,
 * prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13,
 * 17.... are the prime numbers.)
 */
public class Programme12 {
    public static boolean main(int args) {
        Scanner p12 = new Scanner(System.in);
        System.out.println("Enter any number");
        int num = p12.nextInt();
        if (main(num)) {
            System.out.println(num + "is prime number");
        } else {
            System.out.println(num + " is not a prime number");
            p12.close();
        }
        //public static boolean main(){ // if i don't comment out this line - i am nit able to fix the minor mistake.
            if (num <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
