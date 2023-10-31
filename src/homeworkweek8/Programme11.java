package homeworkweek8;

import java.util.Scanner;

/**
 * 11. Even Digit Sum
 * Write a method named getEvenDigitSum with one parameter of type int called number.
 * The method should return the sum of the even digits within the number.
 * If the number is negative, the method should return -1 to indicate an invalid value.
 * PRIME TESTING
 * EXAMPLE INPUT/OUTPUT:
 * * getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
 * * getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
 * * getEvenDigitSum(-22); → should return -1 since the number is negative
 * NOTE: The method getEvenDigitSum should be defined as public static
 *
 */

public class Programme11 {
    public static void main(String[] args) {        //main method
        Scanner p11 = new Scanner(System.in);       // identifying scanner
        System.out.println("Enter number : ");      //print statement
        int number = p11.nextInt();                 //assigning scanner
        //print statement for even digit
        System.out.println("The sum of the even digits :" + number + " is " + getEvenDigitSum(number));
        p11.close();            //closing scanner
    }

    public static int getEvenDigitSum(int number) {     //static method
        if (number < 0) {                               //if statement for reutning 0
            return -1;
        }
        int sum = 0;                                    //sum of numbers
        while (number > 0) {                            // while loop for calculation
            int digit = number % 10;
            if (digit % 2 == 0) {
                sum += digit;                   //addition method
            }
            number /= 10;
        }
        return sum;
    }
}

