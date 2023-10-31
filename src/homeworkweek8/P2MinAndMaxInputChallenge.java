package homeworkweek8;

import java.util.Scanner;

/**
 * 2. -Read the numbers from the console entered by the user and print the minimum
 * and maximum number the user has entered.
 * -Before the user enters the number, print the message Enter number:
 * -If the user enters an invalid number, break out of the loop and print the minimum and maximum
 * number.
 * Hint:
 * -Use an endless while loop.
 * -Create a class with the name MinAndMaxInputChallenge.
 *
 */
public class P2MinAndMaxInputChallenge {
    public static void main(String[] args) {                        //main method
        Scanner p2 = new Scanner(System.in);                        //declaring scanner
        int min = Integer.MIN_VALUE;                                //assigning min value
        int max = Integer.MAX_VALUE;                                //assigning max value
        while (true) {                                               //while loop
            System.out.println("Enter the number :");
            if (p2.hasNextInt()) {                                 //assigning scanner to min number
                int num = p2.nextInt();                             //assigning min and max to scanner
                if (num < min) {                                    //if statement for min
                    min = num;
                }
                if (num > max) {                                    //if statement for max
                    max = num;
                }
            } else {                                                //else if condition is not fulfilled then printing invalid number
                System.out.println("Invalid Number");
                break;
            }
        }
        System.out.println("Minimum number entered : " + min);
        System.out.println("Maximum number entered : " + max);
        p2.close();                                                 //closing the scanner
    }
}


