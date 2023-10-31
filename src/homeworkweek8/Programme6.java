package homeworkweek8;

import java.util.Scanner;

/**
 * 6. Write a program in Java to display the pattern like a triangle with a number.
 * For eg.
 * Input number of rows: 10
 * Expected Output:
 * 1
 * 12
 * 123
 * 1234
 * 12345
 * 123456
 * 1234567
 * 12345678
 * 123456789
 * 12345678910
 */

public class Programme6 {
    public static void main(String[] args) {        //main method
        Scanner p6 = new Scanner(System.in);        //declaring scanner
        System.out.println("Input number of rows: ");       // print statement to input numbers
        int rows = p6.nextInt();                            //assigning scanner
        for (int i = 1; i <= rows; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
            p6.close();             //closing the scanner
        }

    }
}
