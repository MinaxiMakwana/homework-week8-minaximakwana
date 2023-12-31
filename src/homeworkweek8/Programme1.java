package homeworkweek8;

import java.util.Scanner;

/**
 * 1. Read 10 numbers from the console entered by the user and print the sum of those
 * numbers.
 * -Use the hasNextInt() method from the scanner to check if the user has entered an int value.
 * -If hasNextInt() returns false, print the message Invalid Number. Continue reading until you have read
 * 10 numbers.
 * -Use the nextInt() method to get the number and add it to the sum.
 * -Before the user enters each number, print the message Enter number #x: where x represents the
 * count, i.e. 1, 2, 3, 4, etc.
 * -For example, the first message printed to the user would be Enter number #1:, the next Enter number
 * #2:, and so on.
 * Hint:
 * -Use a while loop.
 * -Use a counter variable for counting valid numbers.
 * -Close the scanner after you don't need it anymore.
 * -Create a class with the name ReadingUserInputChallenge
 */

public class Programme1 {
    public static void main(String[] args) {                            //main method
        Scanner p1 = new Scanner(System.in);                            //created scanner object
        int count = 1;                                                  //created variable
        int sum = 0;
        while (count <= 10) {                                           //while loop which will read 10 numbers
            System.out.println("Enter a number # " + count + ": ");
            if (p1.hasNextInt()) {                                      //If condition
                //sum += p1.hasNextInt();                                 //adding 10 numbers
                count++;                                                //counting using ++ operator
            } else {                                                    //else condition
                System.out.println("Invalid Number");
                p1.next();
            }
        }
        System.out.println("The sum of the number: " + sum);            //printing the sum of numbers
        p1.close();                                                     //closing the scanner object
    }
}
