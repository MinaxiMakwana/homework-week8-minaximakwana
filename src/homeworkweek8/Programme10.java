package homeworkweek8;

import java.util.Scanner;

/**
 * 10. Write a program to input any number and check if it Armstrong number or not
 * 153 = (1*1*1)+(5*5*5)+(3*3*3)
 * where:
 * (1*1*1)=1
 * (5*5*5)=125
 * (3*3*3)=27
 * So:
 * 1+125+27=153
 */
public class Programme10 {
    public static void main(String[] args) {            //main method
        Scanner p10 = new Scanner(System.in);           //declaring scanner
        System.out.println("Enter number : ");
        int num = p10.nextInt();                            //assigning scanner to num
        int originalNumber, remainder, result = 0, n = 0;
        originalNumber = num;
        while ((originalNumber != 0)) {              //while loop for original number
            originalNumber /= 10;
            ++n;
        }
        originalNumber = num;                       //while loop to calculate remainder
        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
            originalNumber /= 10;
        }
        if (result == num) System.out.println(num + " is an Armstrong number"); // if else print statement
        else System.out.println(num + "is not an Armstrong number");
        p10.close();        //closing scanner
    }
}
