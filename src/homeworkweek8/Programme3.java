package homeworkweek8;

import java.util.Scanner;

/**
 * 3. Write a Java program that takes the user to provide a single character from the
 * alphabet. Print Vowel of Consonant, depending on the user input. If the user input
 * Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
 * error message.
 * For eg:
 * Input an alphabet: p
 * Expected Output:
 * Input letter is Consonant
 */

public class Programme3 {
    public static void main(String[] args) {        //main method
        Scanner p3 = new Scanner(System.in);        //scanner declaration
        System.out.println("Input any alphabet");
        char ch1 = p3.next().charAt(0);             //assigning scanner to below method
        if ((ch1 >= 'a' && ch1 <= 'z') || (ch1 >= 'A' && ch1 <= 'Z')) {        //if statement for alphabet
            //if else statement to vowels
            if (ch1 == 'a' || ch1 == 'A' || ch1 == 'e' || ch1 == 'E' || ch1 == 'i' || ch1 == 'I' || ch1 == 'o' || ch1 == 'O' || ch1 == 'u' || ch1 == 'U')
                System.out.println("Your input alphabet is vowel");
            else System.out.println("Your input alphabet is Consonant");
        } else
            System.out.println("Error : Your input is not a letter or is a string of length > 1 ");      //print statement for error message
        p3.close();     //closing the scanner
    }
}
