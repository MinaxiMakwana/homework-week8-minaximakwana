package homeworkweek8;
/**
 * Write a program in Java to display the pattern like a diamond.
 * While loop
 * *
 * ***
 * *****
 * *******
 * *********
 * ***********
 * *************
 * ***********
 * *********
 * *******
 * *****
 * ***
 * *
 */

import java.util.Scanner;

public class Programme14 {
    public static void main(String[] args) {
        Scanner p14 = new Scanner(System.in);
        System.out.println("Enter N : ");
        int n = p14.nextInt();
        System.out.println("Enter Symbol : ");
        char c = p14.next().charAt(0);
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= n - i) {
                System.out.println(" ");
                j++;
            }
            j = 1;
            while (j <= i * 2 - 1) {
                System.out.println(c);
                j++;
            }
            System.out.println();
            i++;
        }
        i = n - 1;
        while (i >= 1) {
            int j = 1;
            while (j <= n - i) {
                System.out.println(" ");
                j++;
            }
            j = 1;
            while (j <= i * 2 - 1) {
                System.out.println(c);
                j++;
            }
            System.out.println();
            i--;
        }
    }
}
